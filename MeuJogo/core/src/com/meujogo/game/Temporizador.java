package com.meujogo.game;


import java.util.Timer;
import java.util.TimerTask;

public class Temporizador {
    public static void main(String[] args) {
        final Timer timer = new Timer();

        int delay = 1000; // atraso de 1 segundo
        int period = 1000; // intervalo de 1 segundo

        timer.scheduleAtFixedRate(new TimerTask() {
            int secondsPassed = 0;

            @Override
            public void run() {
                System.out.println("Tempo passado: " + secondsPassed + " segundos");
                secondsPassed++;

                // Se desejar parar o timer após um certo tempo, pode adicionar uma condição
                if (secondsPassed > 10) {
                    timer.cancel();
                }
            }
        }, delay, period);
    }
}
