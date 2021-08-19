package com.example.welcomeclient.services;

/**
 * RussianRouletteService should handle draw methods and return results.
 */
public interface RussianRouletteService {

    /**
     * Make a draw and compare bullet position and drawn position.
     *
     * @return decision if the bullet was drawn
     */
    boolean spinAndGetResult();

}
