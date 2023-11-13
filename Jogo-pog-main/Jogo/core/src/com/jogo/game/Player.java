package com.jogo.game;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

/**
 * Classe que representa o jogador no jogo.
 */
public class Player {
    
    /** Sprite do jogador. */
    private Sprite player;    
    
    /** Posição x do jogador. */
    private float posX;

    /** Posição y do jogador. */
    private float posY;

    /** Velocidade de movimentação do jogador. */
    private float velocity;

    /** Número de vidas do jogador. */
    private int lifes = 3;
    
    /**
     * Move o jogador com base nas teclas pressionadas.
     */
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

    /**
     * Obtém o sprite do jogador.
     * @return Sprite do jogador.
     */
    public Sprite getCharacter() {
        return player;
    }

    /**
     * Define o sprite do jogador.
     * @param character Novo sprite do jogador.
     */
    public void setCharacter(Sprite character) {
        this.player = character;
    }

    /**
     * Obtém a posição x do jogador.
     * @return Posição x do jogador.
     */
    public float getPosX() {
        return posX;
    }

    /**
     * Define a posição x do jogador.
     * @param posX Nova posição x do jogador.
     */
    public void setPosX(float posX) {
        this.posX = posX;
    }

    /**
     * Obtém a posição y do jogador.
     * @return Posição y do jogador.
     */
    public float getPosY() {
        return posY;
    }

    /**
     * Define a posição y do jogador.
     * @param posY Nova posição y do jogador.
     */
    public void setPosY(float posY) {
        this.posY = posY;
    }

    /**
     * Obtém a velocidade de movimentação do jogador.
     * @return Velocidade de movimentação do jogador.
     */
    public float getVelocity() {
        return velocity;
    }

    /**
     * Define a velocidade de movimentação do jogador.
     * @param velocity Nova velocidade de movimentação do jogador.
     */
    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }

    /**
     * Obtém o número de vidas do jogador.
     * @return Número de vidas do jogador.
     */
    public int getLifes() {
        return lifes;
    }

    /**
     * Define o número de vidas do jogador.
     * @param vidas Novo número de vidas do jogador.
     */
    public void setLifes(int vidas) {
        this.lifes = vidas;
    }
}
