package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int value;

        while ((value = scanner.nextInt()) != 0) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(max());
    }
}
