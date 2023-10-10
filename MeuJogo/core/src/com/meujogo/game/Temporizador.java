package com.meujogo.game;

import java.util.Calendar;

public class Temporizador {
	
	private Calendar c = Calendar.getInstance();
	private long tempoFinal;
    private long tempoInicial = c.getTimeInMillis();
    
    public long tempo() {
    	tempoFinal = c.getTimeInMillis();
    	return tempoFinal - tempoInicial;
    }
}
