package com.jogo.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

/**
 * Classe que representa o escudo no jogo.
 */
public class Shield {
    
    /** Contador para controle de eventos do escudo. */
    private int contadorSh = 0;

    /** Sinaliza se o escudo está ativado. */
    private boolean shieldAct = false;

    /** Tempo auxiliar para controle de eventos do escudo. */
    private long tempoAuxilioSh = -5010;

    /**
     * Construtor da classe Shield.
     */
    public Shield() {

    }

    /**
     * Ativa ou desativa o escudo com base nas teclas pressionadas.
     * @param tempo Tempo atual do jogo.
     */
    public void shieldActived(long tempo) {
        System.out.println(tempo);
        if (Gdx.input.isKeyJustPressed(Input.Keys.ENTER) || tempo - tempoAuxilioSh >= -5 && tempo - tempoAuxilioSh <= 0) {
            shieldAct = true;
            if (contadorSh == 0) {
                tempoAuxilioSh = tempo + 5;
                contadorSh++;
            }

        } else {
            shieldAct = false;
            if (tempo - tempoAuxilioSh >= 30) {
                contadorSh = 0;
            }
        }
    }

    /**
     * Verifica se o escudo está ativado.
     * @return True se o escudo estiver ativado, False caso contrário.
     */
    public boolean isShieldAct() {
        return shieldAct;
    }

    /**
     * Define o estado do escudo.
     * @param shieldAct Novo estado do escudo.
     */
    public void setShieldAct(boolean shieldAct) {
        this.shieldAct = shieldAct;
    }
    
    /**
     * Define o tempo auxiliar para controle de eventos do escudo.
     * @param tempoAuxilioSh Novo tempo auxiliar para controle de eventos do escudo.
     */
    public void setTempoAuxilioSh(int tempoAuxilioSh) {
        this.tempoAuxilioSh = tempoAuxilioSh;
    }
}
