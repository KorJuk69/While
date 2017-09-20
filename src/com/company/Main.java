package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sosud1 = scanner.nextInt();
        int sosud2 = scanner.nextInt();
        int n = scanner.nextInt();
        int i = 0;
        int a = 0;
        int b = 0;

        if ((n>sosud1)||(n>sosud2)||((sosud1==sosud2)&&(sosud1!=n))){
            System.out.print("Impossible");
        }
        else {

            while ((a!=n)&&(b!=n)){

                if (sosud1<sosud2){

                    while (b<(sosud2-sosud1)) {
                        if (a==0){
                            System.out.println(">A");
                            a = sosud1;
                        }
                        System.out.println("A>B");
                        b += a;
                        a = 0;
                    }
                    System.out.println(">A");
                    System.out.println("A>B");
                    a = b + sosud1 - sosud2;
                    System.out.println("B>");
                    b = 0;

                }
                else {

                    while (a<(sosud1-sosud2)) {
                        if (b==0){
                            System.out.println(">B");
                            b = sosud2;
                        }
                        System.out.println("B>A");
                        a += b;
                        b = 0;
                    }
                    System.out.println(">B");
                    System.out.println("B>A");
                    b = a + sosud2 - sosud1;
                    System.out.println("A>");
                    a = 0;

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
