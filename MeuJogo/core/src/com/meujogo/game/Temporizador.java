package com.meujogo.game;

import java.util.Calendar;

public class Temporizador {
	
	private long tempoFinal;
	private long tempoInicial;
	private Calendar c;
	
	public Temporizador () {
		c = Calendar.getInstance();
	    tempoInicial = c.getTimeInMillis();
	}
    
    public long getTempo() {
    	c = Calendar.getInstance();
    	tempoFinal = c.getTimeInMillis();
    	return tempoFinal - tempoInicial;
    }
}
