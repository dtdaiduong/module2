package com.duong.loopsInJava;

import java.util.Scanner;

public class ShowFirstPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int numbers = scanner.nextInt();
        int count = 0;
        int n = 2;
        boolean prime = true;
        while (count <= numbers) {
            prime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
            if(prime){
                System.out.printf("%d\t", n);
                count++;
            }
            n++;
        }
    }
}
