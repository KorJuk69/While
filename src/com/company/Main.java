package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if(a!=1) {

            while ((a / 2) % 2 == 0) {
                a = a / 2;
            }
        }

        if((a==2)||(a==1)){
            System.out.print("Yes");
        }
        else {
            System.out.print("NO");
        }



    }
}
