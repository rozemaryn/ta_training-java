package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class LocalMaximaRemove {
    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array) {
        int[] withoutMaxima = new int[array.length];
        int counter = -1;

        for (int i = 0; i <= array.length - 1; i++) {
            if (i == 0) {
                if (array[0] <= array[1]) {
                    withoutMaxima[0] = array[0];
                    counter++;
                }
            }
            else if ((i == array.length - 1 && array[i] <= array[i - 1]) ||
                    ((i < array.length - 1) && (array[i] <= array[i - 1] || array[i] <= array[i + 1]))) {
                withoutMaxima[++counter] = array[i];
            }
        }
        if (counter == -1) {
            withoutMaxima = array;
        }
        int[] finalArr = new int[++counter];
        System.arraycopy(withoutMaxima, 0, finalArr, 0, counter);

        return finalArr;
    }
}
