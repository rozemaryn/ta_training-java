package com.epam.rd.autotasks.meetanagent;

import java.util.Scanner;

public class MeetAnAgent {
    static final int PASSWORD = 133976;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attemptedPassword = sc.nextInt();

        if (attemptedPassword == PASSWORD) {
            System.out.println("Hello, Agent");
        }
        else {
            System.out.println("Access denied");
        }
    }
}
