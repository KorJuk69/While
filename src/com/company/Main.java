package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int i=0;
        int sosud1 = a;
        int sosud2 = b;

        if ((n>a)||(n>b)){
            System.out.print("Impossible");
        }
        else {

            while ((a!=n)||(b!=n)){

                if((sosud1==sosud2)&&(sosud1!=n)){
                    System.out.print("Impossible");
                    break;
                }
                else{
                    if (sosud1<sosud2){

                        //В душе не ебу как это реализовывать

                    }
                }

                i++;
                if (i==100000){
                    System.out.print("Impossible");
                    break;
                }
            }
        }
    }
}
