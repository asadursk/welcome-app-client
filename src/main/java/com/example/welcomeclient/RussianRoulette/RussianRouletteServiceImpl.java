package com.example.welcomeclient.RussianRoulette;

import org.springframework.stereotype.Service;

@Service
public class RussianRouletteServiceImpl implements RussianRouletteService {
    private final int minRandomRange = 1;
    private final int maxRandomRange = 6;

    public boolean spinAndGetResult() {
        Integer bulletPosition = drawPosition();
        Integer currentPosition = drawPosition();

        return bulletPosition.equals(currentPosition);
    }

    private int drawPosition() {
        return (int) ((Math.random() * (maxRandomRange - minRandomRange)) + minRandomRange);
    }
}
