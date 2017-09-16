package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (a!=b){

            if(a<=b*2){
                a--;
                System.out.println("-1");
            }
            else {
                if (a % 2 == 1) {
                    a--;
                    System.out.println("-1");
                } else {
                    a = a / 2;
                    System.out.println(":2");
                }
            }
        }
    }
}
