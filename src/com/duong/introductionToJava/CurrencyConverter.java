package com.duong.introductionToJava;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args){
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền ");
        usd = sc.nextDouble();
        double quyDoi = usd * 23000;
        System.out.print("Giá trị VND: " + quyDoi);
    }
}
