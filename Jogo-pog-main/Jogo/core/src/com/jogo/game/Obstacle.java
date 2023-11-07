package com.jogo.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.TimeUtils;
import java.util.Iterator;

public class Obstacle {
	
	private Array<Rectangle> obstacles;
	private long frequenciaObstaculo;
	private int frequenciaAtual = 777777777;
	private int frequenciaAntiga = 777777778;
	private float velocidadeAtual = 10;
	private float velocidadeAntiga = 9;
	private long tempoAuxilio = -5010;
	private int contador = 0;
	private Texture tObstacle;
	private Player player = new Player();
	private Shield shield = new Shield();
	private boolean gameover;

	public Obstacle(Texture tObstacle, Player player) {
		this.tObstacle = tObstacle;
		this.player = player;
	}
	
	public Obstacle() {
		
	}

	public void spawnObstacle (Texture tObstacle) {
		Rectangle obstacle = new Rectangle(Gdx.graphics.getWidth(), MathUtils.random(0, Gdx.graphics.getHeight() - tObstacle.getHeight()), tObstacle.getWidth(), tObstacle.getHeight());
		obstacles.add(obstacle);
		frequenciaObstaculo = TimeUtils.nanoTime();
	}
	
	public void moveObstacles(long tempo) {
		if(TimeUtils.nanoTime() - frequenciaObstaculo > frequenciaGeracaoObstaculo(tempo)) {
			this.spawnObstacle(tObstacle);
		}
		
		for(Iterator<Rectangle> iter = obstacles.iterator(); iter.hasNext();) {
			Rectangle obstacle = iter.next();
			if (Gdx.input.isKeyJustPressed(Input.Keys.SPACE) || tempo - tempoAuxilio >= -5 && tempo - tempoAuxilio <= 0) {
				if (contador == 0) {
					tempoAuxilio = tempo + 5;
					contador++;
				}
				obstacle.x -= 10;
			}else {
				obstacle.x -= velocidadeGeracaoObstaculo(tempo);
				if (tempo - tempoAuxilio >= 10) {
					contador = 0;
					System.out.println("Passou");
				}
				System.out.println("TempoAuxilio: " + tempoAuxilio);
				System.out.println("Tempo: " + tempo);
			}
			
			if (collide(obstacle.x, obstacle.y, obstacle.height, obstacle.width, player.getPosX(), player.getPosY(), player.getCharacter().getWidth(), player.getCharacter().getHeight() ) && !gameover ) {
				iter.remove();
				if (!shield.isShieldAct()) {
					player.setLifes(player.getLifes() - 1);
				}
				if (player.getLifes() <= 0) {
					gameover = true;
				}
			}
			if (obstacle.x < 0-obstacle.width) {
				iter.remove();
			}
		}
		
	}
	
	private boolean collide (float x1, float y1, float w1, float h1, float x2, float y2, float w2, float h2) {
		if (x1 + w1 > x2 && x1 < x2 + w2 && y1 + h1 > y2 && y1 < y2 + h2) {
			return true;
		}
		return false;
	}
	
	private int frequenciaGeracaoObstaculo (long tempo) {
		if (tempo > 15 && tempo < 45) {
			if(frequenciaAtual < frequenciaAntiga) {
				frequenciaAntiga = frequenciaAtual;
				frequenciaAtual -= 75000;
			}
		}else if (tempo > 45 && tempo < 90) {
			if(frequenciaAtual < frequenciaAntiga) {
				frequenciaAntiga = frequenciaAtual;
				frequenciaAtual -= 90000;
			}
		}
		return frequenciaAtual;
	}
	
	private float velocidadeGeracaoObstaculo (long tempo) {
		if (tempo >= 10 && tempo <= 50) {
			if (velocidadeAtual > velocidadeAntiga) {
				velocidadeAntiga = velocidadeAtual;
				velocidadeAtual += 0.005;
				System.out.println(velocidadeAtual);
			}
		}
		return velocidadeAtual;
	}

	public Array<Rectangle> getObstacles() {
		return obstacles;
	}

	public void setObstacles(Array<Rectangle> obstacles) {
		this.obstacles = obstacles;
	}

	public void setFrequenciaObstaculo(long frequenciaObstaculo) {
		this.frequenciaObstaculo = frequenciaObstaculo;
	}

	public void setFrequenciaAtual(int frequenciaAtual) {
		this.frequenciaAtual = frequenciaAtual;
	}

	public void setFrequenciaAntiga(int frequenciaAntiga) {
		this.frequenciaAntiga = frequenciaAntiga;
	}

	public void setVelocidadeAtual(float velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public void setVelocidadeAntiga(float velocidadeAntiga) {
		this.velocidadeAntiga = velocidadeAntiga;
	}
	
	public void settempoAuxilio(int tempoAuxilio) {
		this.tempoAuxilio = tempoAuxilio;
	}

	public boolean isGameover() {
		return gameover;
	}

	public void setGameover(boolean gameover) {
		this.gameover = gameover;
	}
	
	
	
}
