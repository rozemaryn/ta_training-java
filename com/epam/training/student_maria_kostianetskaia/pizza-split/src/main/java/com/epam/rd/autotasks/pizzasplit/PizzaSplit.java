package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfPeople = input.nextInt();
        int numberOfSlices = input.nextInt();

        int numberOfPizzas = 1;

        while ((numberOfPizzas*numberOfSlices)%numberOfPeople !=0) {
            numberOfPizzas++;
        }
        System.out.println(numberOfPizzas);
    }
}
