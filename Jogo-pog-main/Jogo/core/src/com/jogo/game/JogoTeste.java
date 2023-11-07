package com.jogo.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import java.util.Calendar;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.Color;


public class JogoTeste extends ApplicationAdapter {

	private SpriteBatch batch;
	private Texture img, tCharacter, tObstacle;
	private Player player;
	private Obstacle obstacle;
	private Texts text;
	private Shield shield;
	
	private Temporizador temp;
	private Calendar tempoAtual;
	
	@Override
	public void create () {
		
		batch = new SpriteBatch();
		img = new Texture("fundo.jpg");
		tCharacter = new Texture("personagem.png");
		tObstacle = new Texture("inimigo.png");

		player = new Player();
		player.setCharacter(new Sprite(tCharacter));
		player.setPosX(100);
		player.setPosY(250);
		player.setVelocity(12);
		player.setLifes(3);
		
		obstacle = new Obstacle(tObstacle, player);
		obstacle.setObstacles(new Array<Rectangle>());
		obstacle.setFrequenciaObstaculo(10);
		obstacle.setGameover(false);
				
		text = new Texts();  
		text.setGenerator(new FreeTypeFontGenerator(Gdx.files.internal("font.ttf")));
		text.setParam(new FreeTypeFontGenerator.FreeTypeFontParameter());
		text.getParam().size = 30;
		text.getParam().borderWidth = 1;
		text.getParam().borderColor = Color.BLACK;
		text.getParam().color = Color.WHITE;
		text.setBitmap(text.getGenerator().generateFont(text.getParam()));
		
		shield = new Shield(tCharacter);
		
		temp = new Temporizador();
	}

	@Override
	public void render () {
		
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(img, 0, 0);	
		batch.draw(tCharacter, player.getPosX(), player.getPosY());
				
		if (!obstacle.isGameover()) {
			shield.shield(temp.getTempo()/1000);
			player.moveChar();
			obstacle.moveObstacles(temp.getTempo()/1000);
			for (Rectangle obstacle : obstacle.getObstacles()) {
				batch.draw(tObstacle, obstacle.x, obstacle.y);
			}
			text.getBitmap().draw(
					batch, "Vidas: " + player.getLifes(),
					20,
					Gdx.graphics.getHeight() - 20
					);
			text.getBitmap().draw(batch, "Tempo: " + temp.getTempo()/1000, Gdx.graphics.getWidth() - 160, Gdx.graphics.getHeight() - 20);
		} else {
			text.getBitmap().draw(
					batch, "GAME OVER!",
					Gdx.graphics.getWidth() / 2 - 75,
					Gdx.graphics.getHeight() /2 + 10
					);
			
			text.getBitmap().draw(batch, temp.getTempoMorte(), Gdx.graphics.getWidth() - 160, Gdx.graphics.getHeight() - 20);
			
			player.setPosY(9999999);
			player.setPosX(9999999);
			
		if ( Gdx.input.isKeyPressed(Input.Keys.ENTER) ) {
			obstacle.setGameover(false);
			player.setPosX(100);
			player.setPosY(250);
			player.setLifes(3);
			tempoAtual = Calendar.getInstance();
			temp.setTempo(tempoAtual.getTimeInMillis());
			obstacle.setVelocidadeAtual(10);
			obstacle.setVelocidadeAntiga(9);
			obstacle.setFrequenciaAtual(777777777);
			obstacle.setFrequenciaAntiga(777777778);
			obstacle.settempoAuxilio(-5010);
		}
		}
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
		tCharacter.dispose();
		tObstacle.dispose();
	}
}