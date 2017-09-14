package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i=2;

        while (i<=a){

            if(a%i==0){

                System.out.print(i);
                break;

            }
            i++;

        }

    }
}
