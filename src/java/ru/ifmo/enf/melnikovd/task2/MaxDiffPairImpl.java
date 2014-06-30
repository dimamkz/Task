package ru.ifmo.enf.melnikovd.task2;


public class MaxDiffPairImpl implements MaxDiffPair {
    @Override
    public Pair getMax(int[] input) {
        if (input.length < 2) {
            throw new IllegalArgumentException("Illegal length of array exception");
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int l = 0;
        int r = input.length - 1;
        while (l < r) {
            int curMax;
            int curMin;
            if (input[l] < input[r]) {
                curMin = input[l];
                curMax = input[r];
            } else {
                curMin = input[r];
                curMax = input[l];
            }
            if (curMax > max) {
                max = curMax;
            }
            if (curMin < min) {
                min = curMin;
            }
            l++;
            r--;
        }
        return new Pair(min, max);
    }
}
