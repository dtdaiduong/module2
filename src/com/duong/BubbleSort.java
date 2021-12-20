package com.duong;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] myList = {5,6,8,1,4,3,7,2};
        System.out.println(Arrays.toString(myList));
        System.out.println("mang sau khi sap xep: ");
        int t;
        for (int i = 0; i < myList.length - 1 ; i++) {
            for (int j = myList.length - 1; j > i; j--) {
                if(myList[j]<myList[j-1]){
                    t = myList[j-1];
                    myList[j-1] = myList[j] ;
                    myList[j]=t;
                }
            }
        }
        System.out.println(Arrays.toString(myList));
    }
}
