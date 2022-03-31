package ebruMeryemFikriyeDilekSoruCozumu;

import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yas girin");
        int yas=scan.nextInt();
        if(yas<65){
            System.out.println("emekli olamazsin." + (65-yas) +" yil daha calismalisin");
        }else if(yas>65){
            System.out.println("emekli olabilirsini");
        }else {
            System.out.println("hatali giris");
        }
    }
}
