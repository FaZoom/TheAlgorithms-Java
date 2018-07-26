package com.company;

import java.util.Scanner;

public class Diziler {
    public static void main(String[] args) {
        int [] a = new int[5];
        int i = 0;
        int sonuc = 0;

        Scanner scn = new Scanner(System.in);

        while (i<5) {
            System.out.print((i+1) + ". sayıyı girin : ");
            a[i] = scn.nextInt();
            i++;
        }

        for (int x = 0; x<5; x++) {
            sonuc = sonuc + a[x];
        }

        System.out.println("Sonuç : " + sonuc);

    }
}
