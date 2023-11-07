package com.jogo.game;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class Player {
	private Sprite player;	
	private float posX, posY, velocity;
	private int lifes = 3;
	
	public void moveChar() {
		if (Gdx.input.isKeyPressed(Input.Keys.UP) || Gdx.input.isKeyPressed(Input.Keys.W)) {
			if (posY < Gdx.graphics.getHeight() - player.getHeight()) {
				posY += velocity;
			}
		}
		if (Gdx.input.isKeyPressed(Input.Keys.DOWN) || Gdx.input.isKeyPressed(Input.Keys.S)) {
			if (posY > 0) {
				posY -= velocity;
			}
		}
		if (Gdx.input.isKeyPressed(Input.Keys.RIGHT) || Gdx.input.isKeyPressed(Input.Keys.D)) {
			if (posX < Gdx.graphics.getWidth() - player.getWidth() ) {
				posX += velocity;
			}
		}
		if (Gdx.input.isKeyPressed(Input.Keys.LEFT) || Gdx.input.isKeyPressed(Input.Keys.A)) {
			if (posX  > 0) {
				posX -= velocity;
			}
		}
	}

	public Sprite getCharacter() {
		return player;
	}

	public void setCharacter(Sprite character) {
		this.player = character;
	}

	public float getPosX() {
		return posX;
	}

	public void setPosX(float posX) {
		this.posX = posX;
	}

	public float getPosY() {
		return posY;
	}

	public void setPosY(float posY) {
		this.posY = posY;
	}

	public float getVelocity() {
		return velocity;
	}

	public void setVelocity(float velocity) {
		this.velocity = velocity;
	}

	public int getLifes() {
		return lifes;
	}

	public void setLifes(int vidas) {
		this.lifes = vidas;
	}
}
