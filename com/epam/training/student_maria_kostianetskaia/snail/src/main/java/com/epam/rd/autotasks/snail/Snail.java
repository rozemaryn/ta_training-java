package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ascend = scanner.nextInt();
        int descend = scanner.nextInt();
        int treeHeight = scanner.nextInt();

        int days = 1;
        int ascensionByDay = 0;

        if (ascend <= descend && ascend < treeHeight) {
            System.out.println("Impossible");
        } else {
            while (ascensionByDay < treeHeight) {
                ascensionByDay += ascend;
                if (ascensionByDay >= treeHeight) {
                    System.out.println(days);
                    break;
                } else {
                    days++;
                    ascensionByDay -= descend;
                }
            }
        }
    }
}

