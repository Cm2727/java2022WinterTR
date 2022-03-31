package day05_matematikselIslemler;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {
    public static void main(String[] args) {
        //kullanicidan aldiginiz 4 basamakli bir sayinin
        //basamaklar toplamini bulunuz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();


        int rakam = 0;
        int rakamlarToplami = 0;

        rakam = sayi % 10;
        rakamlarToplami += rakam;

        sayi /= 10;


        rakam = sayi % 10;
        rakamlarToplami += rakam;

        sayi /= 10;


    }
}
