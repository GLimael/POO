package com.meujogo.game;

import java.util.Timer;
import java.util.TimerTask;

public class Temporizador {
    private static int segundosPassados = 0;

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                segundosPassados++;
                //System.out.println("Tempo passado: " + segundosPassados + " segundos");
            }
        }, 1000, 1000);
    }
}
