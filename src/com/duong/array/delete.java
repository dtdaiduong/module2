package com.duong.array;

import java.util.Arrays;
import java.util.Scanner;

public class delete {
    public static void main(String[] args) {
        int[] myList = {5, 6, 7, 2, 4, 1, 3, 9, 8, 0};
        System.out.println(Arrays.toString(myList));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = scanner.nextInt();
        boolean found = false;
        int count = 0;
        for (int i = 0, j = 0; i < myList.length; i++) {
            if (myList[i] == x) {
                myList[i] = myList[i + 1];
                found = true;
                count++;
                System.out.printf(" vi tri cua %d la:  %d\n", x, i + 1);
            }
            if (found && i < myList.length - 1)
                myList[i] = myList[i + 1];
        }
        System.out.print("[");
        for (int i = 0; i < myList.length - count; i++) {
            System.out.print(myList[i] + ", ");
        }
        System.out.print("0]");
    }
}

