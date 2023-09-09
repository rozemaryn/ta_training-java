package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bill = scanner.nextInt();
        int numberOfFriends = scanner.nextInt();
        int splitBill;

        if (bill < 0) {
            System.out.println("Bill total amount cannot be negative");
        }
        else if(numberOfFriends <=0) {
            System.out.println("Number of friends cannot be negative or zero");
        }
        else {
            int billWithTips = bill + (bill / 100) * 10;
            splitBill = billWithTips / numberOfFriends;
            System.out.println(splitBill);
        }
    }
}
