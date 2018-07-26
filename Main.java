package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        PazarListesi list = new PazarListesi(10);
        list.listeyeEkle("Ekmek");
        list.listeyeEkle("Salep");
        list.listeyeEkle("Su");
        list.listeyeEkle("Sucuk");
        list.listeyeEkle("Gofret");
        list.listeyeEkle("Patates");

        System.out.println( list.max() );
        System.out.println( list.min() );
    }
}
