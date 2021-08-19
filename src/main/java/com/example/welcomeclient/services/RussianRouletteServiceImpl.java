package com.example.welcomeclient.services;

import lombok.AllArgsConstructor;

import java.util.Random;

@AllArgsConstructor
public class RussianRouletteServiceImpl implements RussianRouletteService {

    public boolean spinAndGetResult() {
        Integer bulletPosition = drawPosition();
        Integer currentPosition = drawPosition();

        return bulletPosition.equals(currentPosition);
    }

    private int drawPosition() {
        Random random = new Random();
        int maxRandomRange = 7;
        int minRandomRange = 1;

        return random.nextInt(maxRandomRange - minRandomRange) + minRandomRange;
    }
}
