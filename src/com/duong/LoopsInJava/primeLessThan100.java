package com.duong.LoopsInJava;

public class primeLessThan100 {
    public static void main(String[] args) {
        int count = 0;
        int n = 2;
        boolean prime = true;
        while (count <= 100) {
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
