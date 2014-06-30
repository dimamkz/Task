package ru.ifmo.enf.melnikovd.task;

import junit.framework.Assert;
import org.junit.Test;

public class IncreasingSubsequenceFinderTest {
    @Test
    public void testFindSequence(){
        int[] input = {11, 1, 1, 4, 1, 5, 6, 9, 2};
        IncreasingSubsequenceFinder finder = new IncreasingSubsequenceFinderImpl();
        int ans = finder.findMaxLength(input);
        Assert.assertEquals(5, ans);
    }
    @Test
    public void testInputIsEmpty(){
        int[] input = {};
        IncreasingSubsequenceFinder finder = new IncreasingSubsequenceFinderImpl();
        int ans = finder.findMaxLength(input);
        Assert.assertEquals(0, ans);
    }
    @Test
    public void testDecreasingSequence(){
        int[] input = {5,4,3,2,1};
        IncreasingSubsequenceFinder finder = new IncreasingSubsequenceFinderImpl();
        int ans = finder.findMaxLength(input);
        Assert.assertEquals(1, ans);
    }
    @Test
    public void testIncreasingSequence(){
        int[] input = {1,2,3,4,5};
        IncreasingSubsequenceFinder finder = new IncreasingSubsequenceFinderImpl();
        int ans = finder.findMaxLength(input);
        Assert.assertEquals(5, ans);
    }
    @Test
    public void testSmallSequence(){
        int[] input = {3, 29, 5, 5, 28 ,6};
        IncreasingSubsequenceFinder finder = new IncreasingSubsequenceFinderImpl();
        int ans = finder.findMaxLength(input);
        Assert.assertEquals(3, ans);
    }
    @Test
    public void testOneElement(){
        int[] input = {0};
        IncreasingSubsequenceFinder finder = new IncreasingSubsequenceFinderImpl();
        int ans = finder.findMaxLength(input);
        Assert.assertEquals(1, ans);
    }
}
