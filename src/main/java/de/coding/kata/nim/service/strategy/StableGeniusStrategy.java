package de.coding.kata.nim.service.strategy;

/**
 * Computer game strategy for winning the game
 */
public class StableGeniusStrategy implements GameStrategy {

    @Override
    public int execute(int remainingMatches) {
        if(remainingMatches < 1) throw new IllegalArgumentException("Cannot execute strategy!");

        final int maxMatches = Math.min(remainingMatches, MAX_MATCHES);
        return MIN_MATCHES == maxMatches ? 1 : (remainingMatches > 3 ? maxMatches : remainingMatches - 1);
    }
}
