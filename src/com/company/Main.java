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

        if (a==1){
            System.out.print("1-2");
        }
        else {
            if (a==2){
                System.out.print(3);
            }
            else {
                if (a==3){
                    System.out.print(4);
                }
                else {

                    while (true){

                        if (a==n){
                            System.out.print(i);
                            break;
                        }
                        if (n==Integer.MAX_VALUE){
                            System.out.print(-1);
                            break;
                        }

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
