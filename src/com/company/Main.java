package com.company;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int i=1;

        while(i<=N){

            int Sqrt = (int)sqrt(i);
            if(i==Sqrt*Sqrt){
                System.out.println(i);
            }
            i++;

        }

    }
}
