package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i = 1;
        int b = 1;

        while (i<=a){

            if((i-b)==0){

                System.out.print(i + " ");
                b=b*2;

            }
            i++;

        }

    }
}
