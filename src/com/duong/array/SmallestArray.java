package com.duong.array;

import java.util.Scanner;

public class SmallestArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai mang:");
        int m = scanner.nextInt();
        int smallestArray[]= new int[m];
        System.out.println("nhap gia tri cho tung phan tu\n ");
        for (int i = 0; i < m; i++) {
            System.out.println("a["+i+"]");
            smallestArray[i]= scanner.nextInt();
        }
        System.out.println("Mang vua nhap la:");
        for (int i = 0; i < m; i++) {
            System.out.print(smallestArray[i]+" ");
        }
        int max = smallestArray[0];
        for (int i = 0; i < m; i++) {
                if (max > smallestArray[i]) {
                    max = smallestArray[i];
            }
        }
        System.out.println("\nPhần tử nhỏ nhất trong mảng = " + max);
    }
}
