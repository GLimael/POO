package com.jogo.game;

import java.util.Calendar;

/**
 * Classe que representa um temporizador no jogo.
 */
public class Temporizador {

    /** Tempo final do temporizador. */
    private long tempoFinal;

    /** Tempo inicial do temporizador. */
    private long tempoInicial;

    /** Objeto de calendário para obtenção do tempo. */
    private Calendar c;
    
    /**
     * Construtor da classe Temporizador.
     */
    public Temporizador() {
        c = Calendar.getInstance();
        tempoInicial = c.getTimeInMillis();
    }
    
    /**
     * Obtém o tempo decorrido desde o início do temporizador.
     * @return Tempo decorrido em milissegundos.
     */
    public long getTempo() {
        c = Calendar.getInstance();
        tempoFinal = c.getTimeInMillis();
        return tempoFinal - tempoInicial;
    }
    
    /**
     * Define o tempo inicial do temporizador.
     * @param tempo Novo tempo inicial.
     */
    public void setTempo(long tempo) {
        this.tempoInicial = tempo;
    }
    
    /**
     * Obtém o tempo decorrido formatado como uma string.
     * @return Tempo decorrido formatado.
     */
    public String getTempoMorte() {
        String tempoString = String.valueOf((tempoFinal - tempoInicial) / 1000);
        return "Tempo: " + tempoString;
    }
}
