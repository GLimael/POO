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

/**
 * Classe principal que representa o jogo.
 */
public class Jogo extends ApplicationAdapter {

	/** O objeto utilizado para renderizar sprites na tela. */
	private SpriteBatch batch;

	/** A textura do fundo do jogo. */
	private Texture img;

	/** A textura do personagem do jogador. */
	private Texture tCharacter;

	/** A textura do obstáculo do jogo. */
	private Texture tObstacle;

	/** O objeto que representa o jogador no jogo. */
	private Player player;

	/** O objeto que representa os obstáculos no jogo. */
	private Obstacle obstacle;

	/** O objeto responsável por exibir textos na tela do jogo. */
	private Texts text;

	/** O temporizador utilizado para medir o tempo de jogo. */
	private Temporizador temp;

	/** O objeto utilizado para obter o tempo atual do sistema. */
	private Calendar tempoAtual;

	/**
	 * Inicializa os elementos do jogo.
	 */
	@Override
	public void create() {
		/** Inicializa o objeto utilizado para renderizar sprites na tela. */
		batch = new SpriteBatch();

		/** Carrega a textura do fundo do jogo. */
		img = new Texture("fundo.jpg");

		/** Carrega a textura do personagem do jogador. */
		tCharacter = new Texture("personagem.png");

		/** Carrega a textura do obstáculo do jogo. */
		tObstacle = new Texture("inimigo.png");

		/** Inicializa o objeto que representa o jogador no jogo. */
		player = new Player();
		player.setCharacter(new Sprite(tCharacter));
		player.setPosX(100);
		player.setPosY(250);
		player.setVelocity(12);
		player.setLifes(3);

		/** Inicializa o objeto que representa os obstáculos no jogo. */
		obstacle = new Obstacle(tObstacle, player);
		obstacle.setObstacles(new Array<Rectangle>());
		obstacle.setFrequenciaObstaculo(10);
		obstacle.setGameover(false);

		/** Inicializa o objeto responsável por exibir textos na tela. */
		text = new Texts();
		text.setGenerator(new FreeTypeFontGenerator(Gdx.files.internal("font.ttf")));
		text.setParam(new FreeTypeFontGenerator.FreeTypeFontParameter());
		text.getParam().size = 30;
		text.getParam().borderWidth = 1;
		text.getParam().borderColor = Color.BLACK;
		text.getParam().color = Color.WHITE;
		text.setBitmap(text.getGenerator().generateFont(text.getParam()));

		/** Inicializa o temporizador utilizado para medir o tempo de jogo. */
		temp = new Temporizador();
	}

	/**
	 * Atualiza e renderiza o jogo a cada quadro.
	 */
	@Override
	public void render() {
		/** Limpa a tela com a cor de fundo especificada. */
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.draw(tCharacter, player.getPosX(), player.getPosY());

		/** Verifica se o escudo está ativo para definir a textura do personagem. */
		if (obstacle.getShield()) {
			tCharacter = new Texture("escudo.png");
		} else {
			tCharacter = new Texture("personagem.png");
		}

		/** Verifica se o jogo esta ocorrendo ou se já acabou*/
		if (!obstacle.isGameover()) {
			/**Chama as funções de movimento do player e dos obstáculos*/
			player.moveChar();
			obstacle.moveObstacles(temp.getTempo() / 1000);

			/** Desenha os obstáculos na tela. */
			for (Rectangle obstacle : obstacle.getObstacles()) {
				batch.draw(tObstacle, obstacle.x, obstacle.y);
			}

			/** Exibe informações sobre vidas e tempo na tela. */
			text.getBitmap().draw(batch, "Vidas: " + player.getLifes(), 20, Gdx.graphics.getHeight() - 20);
			text.getBitmap().draw(batch, "Tempo: " + temp.getTempo() / 1000, Gdx.graphics.getWidth() - 160,
					Gdx.graphics.getHeight() - 20);
		} else {
			/** Exibe mensagem de "GAME OVER!" na tela. */
			text.getBitmap().draw(batch, "GAME OVER!", Gdx.graphics.getWidth() / 2 - 75,
					Gdx.graphics.getHeight() / 2 + 10);

			/** Exibe o tempo de morte na tela. */
			text.getBitmap().draw(batch, temp.getTempoMorte(), Gdx.graphics.getWidth() - 160,
					Gdx.graphics.getHeight() - 20);

			/** Move o jogador para uma posição inalcançável após o game over. */
			player.setPosY(9999999);
			player.setPosX(9999999);

			/** Reinicia o jogo se a tecla ENTER for pressionada. */
			if (Gdx.input.isKeyPressed(Input.Keys.ENTER)) {
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
				obstacle.resetShield(-5010);
			}
		}
		batch.end();
	}

	/**
	 * Libera os recursos utilizados pelo jogo.
	 */
	@Override
	public void dispose() {
		/** Libera os recursos utilizados pelo SpriteBatch. */
		batch.dispose();

		/** Libera a textura do fundo do jogo. */
		img.dispose();

		/** Libera a textura do personagem do jogador. */
		tCharacter.dispose();

		/** Libera a textura do obstáculo do jogo. */
		tObstacle.dispose();
	}
}
