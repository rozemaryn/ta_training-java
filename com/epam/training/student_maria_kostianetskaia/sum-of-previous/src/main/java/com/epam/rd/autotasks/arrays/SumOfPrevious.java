package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class SumOfPrevious {
    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};

        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }
    public static boolean[] getSumCheckArray(int[] array)  {
        boolean[] verifySum = new boolean[array.length];
        Arrays.fill(verifySum,false);

        for (int i = 2; i < array.length; i++) {
            verifySum[i] = (array[i] == array[i - 2] + array[i - 1]);
        }
        return verifySum;
    }
}
