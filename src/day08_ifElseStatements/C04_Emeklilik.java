package day08_ifElseStatements;

import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {
        //eger calisan kadinsa 60 yasindan buyuk oldugunda emekli
        //calisan erkekse 65 yasindan buyukse emekli olabilir
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kadin icin K \nerkek icin E harfini giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("yasinizi girin");
        double yas = scan.nextDouble();

        if (cinsiyet == 'K') {
            if (yas < 0 || yas > 125) {
                System.out.println("yas durumunu dogru gir");
            } else if (yas < 60) {
                System.out.println("emekli olamazsin. Daha " + (60 - yas) + " yil calismalisin");
            } else System.out.println("emekli olabilirsin");

        } else if (cinsiyet == 'E') {
            if (yas < 0 || yas > 125) {
                System.out.println("yas durumunu dogru gir");
            } else if (yas < 65) {
                System.out.println("emekli olamazsin. Daha " + (65 - yas) + " yil calismalisin");
            } else System.out.println("emekli olabilirsin");

        } else {
            System.out.println("Lutfen cinsiyet icin gecerli bir harf giriniz");
        }

    }
}
