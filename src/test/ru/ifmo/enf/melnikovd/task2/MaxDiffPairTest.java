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
        Assert.assertEquals(1, pair.x);
        Assert.assertEquals(11, pair.y);
    }

    @Test
    public void testEqualElements() {
        int[] input = {1, 1, 1, 1, 1};
        MaxDiffPair maxDiffPair = new MaxDiffPairImpl();
        MaxDiffPair.Pair pair = maxDiffPair.getMax(input);
        Assert.assertEquals(1, pair.x);
        Assert.assertEquals(1, pair.y);
    }
    @Test
    public void tesPairFromLeft() {
        int[] input = {-1,10, 1, 1, 1};
        MaxDiffPair maxDiffPair = new MaxDiffPairImpl();
        MaxDiffPair.Pair pair = maxDiffPair.getMax(input);
        Assert.assertEquals(-1, pair.x);
        Assert.assertEquals(10, pair.y);
    }
    @Test
    public void tesPairFromRight() {
        int[] input = { 1, 1, 1,-1,10};
        MaxDiffPair maxDiffPair = new MaxDiffPairImpl();
        MaxDiffPair.Pair pair = maxDiffPair.getMax(input);
        Assert.assertEquals(-1, pair.x);
        Assert.assertEquals(10, pair.y);
    }

    @Test
    public void testSmallSequence() {
        int[] input = {-10, -5, -11, 2, 0, 3, 5, 9, 15};
        MaxDiffPair maxDiffPair = new MaxDiffPairImpl();
        MaxDiffPair.Pair pair = maxDiffPair.getMax(input);
        Assert.assertEquals(-11, pair.x);
        Assert.assertEquals(15, pair.y);
    }

    @Test
    public void testTwoPositiveElements() {
        int[] input = {1, 10};
        MaxDiffPair maxDiffPair = new MaxDiffPairImpl();
        MaxDiffPair.Pair pair = maxDiffPair.getMax(input);
        Assert.assertEquals(1, pair.x);
        Assert.assertEquals(10, pair.y);
    }

    @Test
    public void testTwoNegativeElements() {
        int[] input = {-1, -10};
        MaxDiffPair maxDiffPair = new MaxDiffPairImpl();
        MaxDiffPair.Pair pair = maxDiffPair.getMax(input);
        Assert.assertEquals(-10, pair.x);
        Assert.assertEquals(-1, pair.y);
    }

    @Test
    public void testTwoElements() {
        int[] input = {-10, 10};
        MaxDiffPair maxDiffPair = new MaxDiffPairImpl();
        MaxDiffPair.Pair pair = maxDiffPair.getMax(input);
        Assert.assertEquals(-10, pair.x);
        Assert.assertEquals(10, pair.y);
    }

    @Test
    public void testOneElement() {
        int[] input = {-10};
        MaxDiffPair maxDiffPair = new MaxDiffPairImpl();
        try {
            MaxDiffPair.Pair pair = maxDiffPair.getMax(input);
            fail("Method didn't throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // OK, expected exception
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
            // OK, expected exception
        }
    }

}
