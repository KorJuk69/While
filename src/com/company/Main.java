package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum1 = scanner.nextInt();
        double proc = scanner.nextInt();
        int sum2 = scanner.nextInt();
        int years = 0;

        while (sum1<sum2){

            sum1 = (int)(sum1 * ((proc/100)+1));
            years++;

        }

        System.out.print(years);

    }
}
