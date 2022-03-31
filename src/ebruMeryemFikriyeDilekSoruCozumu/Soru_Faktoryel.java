package ebruMeryemFikriyeDilekSoruCozumu;

import java.util.Scanner;

public class Soru_Faktoryel {



    public static void faktoryel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi: ");

        int sayi = scanner.nextInt();
        int faktoryel = 1;

        while (sayi > 0) {
            faktoryel *= sayi;
            sayi--;

        }
        System.out.println("Faktoryel : " + faktoryel);
    }
    public static void main(String[] args) {
        faktoryel();
        faktoryel();

    }
}