package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n=3;
        int nM=2;
        int nMM;
        int i = 4;

        if(a==0){
            System.out.print(0);
        }
        else {
            if(a==1){
                System.out.print(0 + " " + 1);
            }
            else {
                if(a==2){
                    System.out.print(0 + " " + 1 + " " + 1);
                }
                else {
                    if (a==3){
                        System.out.print(0 + " " + 1 + " " + 1 + " " + 2);
                    }
                    else {

                        System.out.print(0 + " " + 1 + " " + 1 + " " + 2 + " ");
                        while (i<=a){

                            System.out.print(n + " ");
                            nMM = nM;
                            nM = n;
                            n = nM + nMM;
                            i++;

                        }
                    }
                }
            }
        }

    }
}
