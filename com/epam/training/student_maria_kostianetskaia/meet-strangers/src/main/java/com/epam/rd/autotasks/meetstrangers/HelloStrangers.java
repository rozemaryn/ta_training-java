package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerForName = new Scanner(System.in);

        int numberOfStrangers = scanner.nextInt();

        if (numberOfStrangers > 0) {
            for (int i = 0; i < numberOfStrangers; i++) {
                String nameOfStranger = scannerForName.nextLine();
                System.out.println("Hello, " + nameOfStranger);
            }
        }
        else if (numberOfStrangers == 0) {
            System.out.println("Oh, it looks like there is no one here");
        }
        else {
            System.out.println("Seriously? Why so negative?");
        }
    }
}
