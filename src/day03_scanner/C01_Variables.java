package day03_scanner;

import java.sql.SQLOutput;

public class C01_Variables {
    public static void main(String[] args) {


        String okulIsmi = "Yildiz Koleji";
        System.out.println(okulIsmi);
        char IlkHarf;
        IlkHarf = 'K';
        System.out.println(IlkHarf);
        int sayi1 = 10, sayi2 = 20;
        System.out.println(sayi1 + sayi2);
        String isim = "Meryem";
        String soyIsim = "Aydin";
        System.out.println("Isminiz :" + isim);
        System.out.println("Soyisminiz :" + soyIsim);

        short sayi3 = 20;
        double sayi4 = 30;
        System.out.println("iki sayinin toplami:" + (sayi3 + sayi4));
        char ozelKarakter = '#';
        System.out.println(ozelKarakter);
        int sayi5 = 20;
        char harf = 'a';
        System.out.println(sayi5 + harf);//ascii tablosunu kullaniypr.a=97

    }
}
