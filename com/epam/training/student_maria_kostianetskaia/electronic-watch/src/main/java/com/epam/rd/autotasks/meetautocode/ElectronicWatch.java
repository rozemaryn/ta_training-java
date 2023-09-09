package com.epam.rd.autotasks.meetautocode;

import java.time.Duration;
import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        Duration duration = Duration.ofSeconds(seconds);

        long HH = duration.toHoursPart();
        long MM = duration.toMinutesPart();
        long SS = duration.toSecondsPart();

        String time = String.format("%01d:%02d:%02d", HH, MM, SS);
        System.out.println(time);
    }
}
