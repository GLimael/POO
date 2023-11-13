package com.jogo.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.TimeUtils;
import java.util.Iterator;

/**
 * Classe que representa os obstáculos no jogo.
 */
public class Obstacle {
    
    /** Lista de obstáculos no jogo. */
    private Array<Rectangle> obstacles;

    /** Tempo de geração do próximo obstáculo. */
    private long frequenciaObstaculo;

    /** Frequência de geração atual dos obstáculos. */
    private int frequenciaAtual = 777777777;

    /** Frequência de geração anterior dos obstáculos. */
    private int frequenciaAntiga = 777777778;

    /** Velocidade de geração atual dos obstáculos. */
    private float velocidadeAtual = 10;

    /** Velocidade de geração anterior dos obstáculos. */
    private float velocidadeAntiga = 9;

    /** Tempo auxiliar para controle de eventos. */
    private long tempoAuxilio = -5010;

    /** Contador de eventos. */
    private int contador = 0;

    /** Textura do obstáculo. */
    private Texture tObstacle;

    /** Objeto que representa o jogador. */
    private Player player = new Player();

    /** Objeto que representa o escudo. */
    private Shield shield = new Shield();

    /** Sinaliza se o jogo está no estado de game over. */
    private boolean gameover;

    /**
     * Construtor da classe Obstacle.
     * @param tObstacle Textura do obstáculo.
     * @param player Objeto que representa o jogador.
     */
    public Obstacle(Texture tObstacle, Player player) {
        this.tObstacle = tObstacle;
        this.player = player;
    }
    
    /**
     * Gera um novo obstáculo no jogo.
     * @param tObstacle Textura do obstáculo.
     */
    public void spawnObstacle (Texture tObstacle) {
        Rectangle obstacle = new Rectangle(Gdx.graphics.getWidth(), MathUtils.random(0, Gdx.graphics.getHeight() - tObstacle.getHeight()), tObstacle.getWidth(), tObstacle.getHeight());
        obstacles.add(obstacle);
        frequenciaObstaculo = TimeUtils.nanoTime();
    }
    
    /**
     * Move os obstáculos na tela.
     * @param tempo Tempo atual do jogo.
     */
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
            } else {
                obstacle.x -= velocidadeGeracaoObstaculo(tempo);
                if (tempo - tempoAuxilio >= 10) {
                    contador = 0;
                }
            }
            shield.shieldActived(tempo);
            
            if (collide(obstacle.x, obstacle.y, obstacle.height, obstacle.width, player.getPosX(), player.getPosY(), player.getCharacter().getWidth(), player.getCharacter().getHeight()) && !gameover) {
                iter.remove();
                System.out.println(shield.isShieldAct());
                if (!shield.isShieldAct()) {
                    player.setLifes(player.getLifes() - 1);
                }
                if (player.getLifes() <= 0) {
                    gameover = true;
                }
            }
            if (obstacle.x < 0 - obstacle.width) {
                iter.remove();
            }
        }
        
    }
    
    /**
     * Verifica a colisão entre dois retângulos.
     * @param x1 Posição x do primeiro retângulo.
     * @param y1 Posição y do primeiro retângulo.
     * @param w1 Largura do primeiro retângulo.
     * @param h1 Altura do primeiro retângulo.
     * @param x2 Posição x do segundo retângulo.
     * @param y2 Posição y do segundo retângulo.
     * @param w2 Largura do segundo retângulo.
     * @param h2 Altura do segundo retângulo.
     * @return True se houver colisão, False caso contrário.
     */
    private boolean collide (float x1, float y1, float w1, float h1, float x2, float y2, float w2, float h2) {
        if (x1 + w1 > x2 && x1 < x2 + w2 && y1 + h1 > y2 && y1 < y2 + h2) {
            return true;
        }
        return false;
    }
    
    /**
     * Calcula a frequência de geração dos obstáculos com base no tempo.
     * @param tempo Tempo atual do jogo.
     * @return A frequência de geração dos obstáculos.
     */
    private int frequenciaGeracaoObstaculo (long tempo) {
        if (tempo > 15 && tempo < 45) {
            if(frequenciaAtual < frequenciaAntiga) {
                frequenciaAntiga = frequenciaAtual;
                frequenciaAtual -= 75000;
            }
        } else if (tempo > 45 && tempo < 90) {
            if(frequenciaAtual < frequenciaAntiga) {
                frequenciaAntiga = frequenciaAtual;
                frequenciaAtual -= 90000;
            }
        }
        return frequenciaAtual;
    }
    
    /**
     * Calcula a velocidade de geração dos obstáculos com base no tempo.
     * @param tempo Tempo atual do jogo.
     * @return A velocidade de geração dos obstáculos.
     */
    private float velocidadeGeracaoObstaculo (long tempo) {
        if (tempo >= 10 && tempo <= 50) {
            if (velocidadeAtual > velocidadeAntiga) {
                velocidadeAntiga = velocidadeAtual;
                velocidadeAtual += 0.005;
            }
        }
        return velocidadeAtual;
    }

    /**
     * Obtém a lista de obstáculos.
     * @return Lista de obstáculos.
     */
    public Array<Rectangle> getObstacles() {
        return obstacles;
    }

    /**
     * Define a lista de obstáculos.
     * @param obstacles Nova lista de obstáculos.
     */
    public void setObstacles(Array<Rectangle> obstacles) {
        this.obstacles = obstacles;
    }

    /**
     * Define o tempo de geração do próximo obstáculo.
     * @param frequenciaObstaculo Tempo de geração do próximo obstáculo.
     */
    public void setFrequenciaObstaculo(long frequenciaObstaculo) {
        this.frequenciaObstaculo = frequenciaObstaculo;
    }

    /**
     * Define a frequência de geração atual dos obstáculos.
     * @param frequenciaAtual Frequência de geração atual dos obstáculos.
     */
    public void setFrequenciaAtual(int frequenciaAtual) {
        this.frequenciaAtual = frequenciaAtual;
    }

    /**
     * Define a frequência de geração anterior dos obstáculos.
     * @param frequenciaAntiga Frequência de geração anterior dos obstáculos.
     */
    public void setFrequenciaAntiga(int frequenciaAntiga) {
        this.frequenciaAntiga = frequenciaAntiga;
    }

    /**
     * Define a velocidade de geração atual dos obstáculos.
     * @param velocidadeAtual Velocidade de geração atual dos obstáculos.
     */
    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    /**
     * Define a velocidade de geração anterior dos obstáculos.
     * @param velocidadeAntiga Velocidade de geração anterior dos obstáculos.
     */
    public void setVelocidadeAntiga(float velocidadeAntiga) {
        this.velocidadeAntiga = velocidadeAntiga;
    }
    
    /**
     * Define o tempo auxiliar para controle de eventos.
     * @param tempoAuxilio Tempo auxiliar para controle de eventos.
     */
    public void settempoAuxilio(int tempoAuxilio) {
        this.tempoAuxilio = tempoAuxilio;
    }

    /**
     * Verifica se o jogo está no estado de game over.
     * @return True se o jogo estiver no estado de game over, False caso contrário.
     */
    public boolean isGameover() {
        return gameover;
    }

    /**
     * Define o estado de game over do jogo.
     * @param gameover Novo estado de game over.
     */
    public void setGameover(boolean gameover) {
        this.gameover = gameover;
    }
    
    /**
     * Obtém o status do escudo.
     * @return True se o escudo estiver ativado, False caso contrário.
     */
    public boolean getShield() {
        return this.shield.isShieldAct();
    }
    
    /**
     * Reinicia o status do escudo.
     * @param tempoAuxilioSh Tempo auxiliar para controle do escudo.
     */
    public void resetShield(int tempoAuxilioSh) {
        this.shield.setTempoAuxilioSh(tempoAuxilioSh);
    }
    
}
