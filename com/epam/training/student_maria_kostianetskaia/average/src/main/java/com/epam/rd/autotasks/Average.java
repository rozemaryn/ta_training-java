package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int value;
        int counter = 0;

        while ((value = scanner.nextInt()) != 0) {
            sum += value;
            counter++;
        }

        int average = sum / counter;
        System.out.println(average);
    }

}