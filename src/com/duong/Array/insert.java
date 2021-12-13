package com.duong.Array;

import java.util.Arrays;
import java.util.Scanner;

public class insert {
    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 7;
        arr[3] = 2;
        arr[4] = 1;
        System.out.println(Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int value = scanner.nextInt();
        System.out.print("Enter number insert: ");
        int index = scanner.nextInt();
        if (index >= 0&&index< arr.length) {
            for (int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = value;
//            for (int element : arr){
//                System.out.print(element + " ");
//            }
//            System.out.println();
            System.out.println(Arrays.toString(arr));
        } else System.out.println("can't insert");

    }
}
