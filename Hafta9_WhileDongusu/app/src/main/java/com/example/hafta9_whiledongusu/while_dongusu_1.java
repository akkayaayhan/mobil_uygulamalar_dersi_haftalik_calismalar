package com.example.hafta9_whiledongusu;

public class while_dongusu_1 {
    public static void main(String[] args) {
        int sayac=1;//ilk değer
        int sonuc=1;
        while (sayac<=5){//son koşul
            sonuc=sonuc*sayac;
            sayac++;//arttırma
        }
        System.out.println(sonuc);
    }
}
