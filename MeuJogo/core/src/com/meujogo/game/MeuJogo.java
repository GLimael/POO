package com.meujogo.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.graphics.Color;

//imports para obstaculo
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.TimeUtils;
import java.util.Iterator;

public class MeuJogo extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture img, tObstacle;
	private Array<Rectangle> obstacles;
	private long frequenciaObstaculo;
	private Temporizador temp;
	private FreeTypeFontGenerator generator;
	private FreeTypeFontGenerator.FreeTypeFontParameter param;
	private BitmapFont bitmap;
	private int frequenciaAtual = 777777777;
	private int frequenciaAntiga = 777777778;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("fundo.png");
		tObstacle = new Texture("bloco-obstaculo.png");
		obstacles = new Array<Rectangle>();
		frequenciaObstaculo = 0;
		temp = new Temporizador();
		generator = new FreeTypeFontGenerator(Gdx.files.internal("font.ttf"));
		param = new FreeTypeFontGenerator.FreeTypeFontParameter();
		param.size = 30;
		param.borderWidth = 1;
		param.borderColor = Color.BLACK;
		param.color = Color.WHITE;
		bitmap = generator.generateFont(param);
	}

	@Override
	public void render () {
		//chamando a função para spawnar obstáculos
		this.moveObstacles(temp.getTempo()/1000);
		
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(img, 0, 0);
		//loop para manter todas as 
		for (Rectangle obstacle : obstacles) {
			batch.draw(tObstacle, obstacle.x, obstacle.y);
		}
		
		bitmap.draw(batch, "Tempo: " + temp.getTempo()/1000, Gdx.graphics.getWidth() - 175, Gdx.graphics.getHeight() - 20);
				
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
	
	private void spawnObstacle () {
		Rectangle obstacle = new Rectangle(Gdx.graphics.getWidth(), MathUtils.random(0, Gdx.graphics.getHeight() - tObstacle.getHeight()), tObstacle.getWidth(), tObstacle.getHeight());
		obstacles.add(obstacle);
		frequenciaObstaculo = TimeUtils.nanoTime();
	}
	
	private int frequenciaGeracaoObstaculo (long tempo) {
		if (tempo > 15 && tempo < 45) {
			if(frequenciaAtual < frequenciaAntiga) {
				frequenciaAntiga = frequenciaAtual;
				frequenciaAtual -= 50000;
				System.out.println(frequenciaAtual);
			}
		}else if (tempo > 45 && tempo < 90) {
			if(frequenciaAtual < frequenciaAntiga) {
				frequenciaAntiga = frequenciaAtual;
				frequenciaAtual -= 75000;
				System.out.println(frequenciaAtual);
			}
		}
		return frequenciaAtual;
	}
	
	private void moveObstacles(long tempo) {
		if(TimeUtils.nanoTime() - frequenciaObstaculo > frequenciaGeracaoObstaculo(tempo)) {
			this.spawnObstacle();
		}
		
		for(Iterator<Rectangle> iter = obstacles.iterator(); iter.hasNext();) {
			Rectangle obstacle = iter.next();
			obstacle.x -= 10;
			if (obstacle.x < 0-obstacle.width) {
				iter.remove();
			}
		}
		
	}
	
//	public boolean getTempoSegundo(long tempoInicial, long tempoFinal) {
//		if (tempoFinal - tempoInicial > )
//	}
}
