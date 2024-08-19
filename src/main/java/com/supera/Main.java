package com.supera;

import com.supera.model.FlorSamambaia;

public class Main {
    public static void main(String[] args) {
        System.out.println(FlorSamambaia.tentativaDesenhar(5, 0, 0, 3, 0, 0)); // RICO
        System.out.println(FlorSamambaia.tentativaDesenhar(5, 0, 0, 5, 0, 0)); // RICO
        System.out.println(FlorSamambaia.tentativaDesenhar(5, 0, 0, 5, 3, 4)); // MORTO
        System.out.println(FlorSamambaia.tentativaDesenhar(5, 0, 0, 4, 3, 4)); // MORTO
    }
}
