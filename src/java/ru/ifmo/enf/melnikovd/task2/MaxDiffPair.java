package ru.ifmo.enf.melnikovd.task2;

public interface MaxDiffPair {
    public static class Pair {
        public final int x;
        public final int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    Pair getMax(int[] input);
}

