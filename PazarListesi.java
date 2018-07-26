package com.company;

public class PazarListesi {
    String [] liste;
    int elemanSayisi;
    int sinir;

    public PazarListesi (int elemanKapasitesi) {
        liste = new String[elemanKapasitesi];
        elemanSayisi = 0;
        sinir = elemanKapasitesi;
    }

    public void listeyeEkle(String eklenecekOlan) {
        if (elemanSayisi < sinir) {
            liste[elemanSayisi] = eklenecekOlan;
            elemanSayisi++;
        }
        else {
            System.out.println("Boş yer kalmadı");
        }
    }

    public void yaz() {
        for (int i = 0; i<elemanSayisi; i++) {
            System.out.println((liste[i]));
        }
    }

    public void sil (int index) {
        if (index > 0 && index <= elemanSayisi && elemanSayisi > 0) {
            for (int i=index; i < elemanSayisi - 1; i++) {
                liste[i] = liste[i+1];
            }
            elemanSayisi--;
        }
        else {
            System.out.println("Hata");
        }

    }

    public void ekle(String eklenecekEleman, int index) {
        if (index <= elemanSayisi && index >= 0 && elemanSayisi < sinir) {
            for (int i = elemanSayisi - 1; i >= index; i--) {
                liste[i+1] = liste[i];
            }
            liste[index] = eklenecekEleman;
            elemanSayisi++;
        }
        else {
            System.out.println("Yanlış İndex");
        }
    }

    public String max() {
        String enBuyuk = liste[0];

        for (int i = 0; i < elemanSayisi; i++) {
            if( liste[i].compareToIgnoreCase(enBuyuk) > 0) {
                enBuyuk = liste[i];
            }
        }
        return enBuyuk;
    }

    public String min() {
        String enKucuk = liste[0];

        for (int i = 0; i < elemanSayisi; i++) {
            if( liste[i].compareToIgnoreCase(enKucuk) < 0) {
                enKucuk = liste[i];
            }
        }
        return enKucuk;
    }

    public void swap(int i1, int i2) {
        String tmp = liste[i1];
        liste[i1] = liste[i2];
        liste[i2] = tmp;
    }
}
