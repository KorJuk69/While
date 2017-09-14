package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int k=0;
        int b=1;

        while(b<N){

            b=b*2;
            k++;

        }

        System.out.print(k);

    }
}
