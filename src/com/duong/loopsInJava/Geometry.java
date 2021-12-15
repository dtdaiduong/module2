package com.duong.loopsInJava;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        int choice = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Menu");
            System.out.println("1. print rectangular");
            System.out.println("2. print botton-left triangle ");
            System.out.println("3. print top-left  triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("*\t");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*\t");
                        }
                        System.out.println("");
                    }
                case 3:
                    for (int i=7;i>=1;i--) {
                        for (int j=1;j<=i;j++) {
                            System.out.print("*\t");
                        }
                        System.out.println("");
                    }
            }

        }
        while (choice != 0);

    }
}

