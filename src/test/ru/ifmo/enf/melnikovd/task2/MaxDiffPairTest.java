package ru.ifmo.enf.melnikovd.task2;

import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.Assert.fail;

public class MaxDiffPairTest {
    @Test
    public void testSmallPositiveSequence() {
        int[] input = {11, 1, 1, 4, 1, 5, 6, 9, 2};
        MaxDiffPair maxDiffPair = new MaxDiffPairImpl();
        MaxDiffPair.Pair pair = maxDiffPair.getMax(input);
        int ans = Math.abs(pair.x - pair.y);
        Assert.assertEquals(10, ans);
    }

    @Test
    public void testSmallSequence() {
        int[] input = {-10, -5, -11, 2, 0, 3, 5, 9, 15};
        MaxDiffPair maxDiffPair = new MaxDiffPairImpl();
        MaxDiffPair.Pair pair = maxDiffPair.getMax(input);
        int ans = Math.abs(pair.x - pair.y);
        Assert.assertEquals(26, ans);
    }

    @Test
    public void testTwoPositiveElements() {
        int[] input = {1, 10};
        MaxDiffPair maxDiffPair = new MaxDiffPairImpl();
        MaxDiffPair.Pair pair = maxDiffPair.getMax(input);
        int ans = Math.abs(pair.x - pair.y);
        Assert.assertEquals(9, ans);
    }

    @Test
    public void testTwoNegativeElements() {
        int[] input = {-1, -10};
        MaxDiffPair maxDiffPair = new MaxDiffPairImpl();
        MaxDiffPair.Pair pair = maxDiffPair.getMax(input);
        int ans = Math.abs(pair.x - pair.y);
        Assert.assertEquals(9, ans);
    }

    @Test
    public void testTwoElements() {
        int[] input = {-10, 10};
        MaxDiffPair maxDiffPair = new MaxDiffPairImpl();
        MaxDiffPair.Pair pair = maxDiffPair.getMax(input);
        int ans = Math.abs(pair.x - pair.y);
        Assert.assertEquals(20, ans);
    }

    @Test
    public void testOneElement() {
        int[] input = {-10};
        MaxDiffPair maxDiffPair = new MaxDiffPairImpl();
        try {
            MaxDiffPair.Pair pair = maxDiffPair.getMax(input);
            fail("Method didn't throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testIsEmpty() {
        int[] input = {};
        MaxDiffPair maxDiffPair = new MaxDiffPairImpl();
        try {
            MaxDiffPair.Pair pair = maxDiffPair.getMax(input);
            fail("Method didn't throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

}
