package ru.ifmo.enf.melnikovd.task;


public class IncreasingSubsequenceFinderImpl implements IncreasingSubsequenceFinder{
    @Override
    public int findMaxLength(int[] input) {
        if (input.length==0) {
            return 0;
        }
        int[] length  = new int[input.length];
        for (int i=1; i<length.length; i++) {
            length[i] = Integer.MAX_VALUE;
        }
        length[0]=1;
        for (int i=1; i<input.length; i++) {
            int max=0;
            for (int j=0; j<i; j++) {
                if ((input[j]<input[i]) && (length[j]>max)) {
                    max=length[j];
                }
            }
            length[i]=max+1;
        }
        int max=length[0];
        for (int i=0; i<length.length; i++) {
            if (length[i]>max) {
                max=length[i];
            }
        }
        return max;
    }
}
