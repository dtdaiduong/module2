package com.duong.array;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        MergeArray mer = new MergeArray();
        int arr1[] = new int[9];
        int arr2[] = new int[12];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }
        System.out.println("first array");
        System.out.println(Arrays.toString(arr1));
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = j + 9;
        }
        System.out.println("second array");
        System.out.println(Arrays.toString(arr2));
        System.out.println("array after united: ");
        int[] arr = mer.mergeArray(arr1, arr2);
        System.out.println(Arrays.toString(arr));
    }

    public int[] mergeArray(int[] arr1, int[] arr2) {
        int length = arr1.length + arr2.length;
        int[] result = new int[length];
        for (int z = 0, i = 0; z < result.length && i < arr1.length; z++, i++) {
            result[z] = arr1[i];
        }
        for (int z = arr1.length, j = 0; z < result.length && j < arr2.length; z++, j++) {
            result[z] = arr2[j];
        }
        return result;
    }
}

