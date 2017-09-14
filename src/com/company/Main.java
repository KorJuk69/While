package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double den1 = scanner.nextInt();
        int den2 = scanner.nextInt();
        int dni=1;

        while (den1<den2){

            den1 = den1 * 1.1;
            dni++;

        }

        System.out.print(dni);

    }
}
