package com.duong.Array;


import java.util.Scanner;

public class TwoWayArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so hang:");
        int m = scanner.nextInt();
        System.out.print("nhap so cot:");
        int n = scanner.nextInt();
        int twoArray[][] = new int [m][n];
        System.out.println("nhap gia tri cho tung phan tu\n ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("a["+i+"]["+j+"]=");
                twoArray[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Mang vua nhap la:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(twoArray[i][j]+" ");
            }System.out.println("");
        }
        int max = twoArray[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < twoArray[i][j]) {
                    max = twoArray[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong ma trận = " + max);

    }
}
