package com.example.welcomeclient;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RandomChoice {

    @Getter
    Integer bulletPosition;

    @Getter
    @Setter
    Integer currentPosition;

    ArrayList<Integer> positionsSoFar=new ArrayList<>();

    public RandomChoice() {
        this.bulletPosition = this.getRandomNumber(1, 6);
        this.currentPosition = this.getRandomNumber(1, 6);
    }

    public void rechoose() {
        do {
            this.currentPosition = this.getRandomNumber(1, 6);
        } while (this.positionsSoFar.contains(this.currentPosition));

        this.positionsSoFar.add(this.currentPosition);

        if(this.currentPosition.equals(this.bulletPosition)) {
            this.positionsSoFar.clear();
        }
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
