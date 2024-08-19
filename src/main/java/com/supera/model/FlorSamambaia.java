package com.supera.model;

public class FlorSamambaia {

    private FlorSamambaia() {
    }

    public static String tentativaDesenhar(int raioFlor, int xFlor, int yFlor, int raioCacador, int xCacador, int yCacador) {
        double distanciaCentros = calcularDistanciaCentros(xFlor, yFlor, xCacador, yCacador);

        if (circuloCobreOutro(distanciaCentros, raioFlor, raioCacador)) {
            return "RICO";
        } else {
            return "MORTO";
        }
    }

    private static double calcularDistanciaCentros(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    private static boolean circuloCobreOutro(double distanciaCentros, int raioMaior, int raioMenor) {
        return distanciaCentros + raioMenor <= raioMaior;
    }
}