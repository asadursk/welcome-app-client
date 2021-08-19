package com.example.welcomeclient.services;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RussianRouletteServiceImpl implements RussianRouletteService {

    public boolean spinAndGetResult() {
        Integer bulletPosition = drawPosition();
        Integer currentPosition = drawPosition();

        return bulletPosition.equals(currentPosition);
    }

    private int drawPosition() {
        int maxRandomRange = 6;
        int minRandomRange = 1;
        return (int) ((Math.random() * (maxRandomRange - minRandomRange)) + minRandomRange);
    }
}
