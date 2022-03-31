package ebruMeryemFikriyeDilekSoruCozumu;

import java.util.Scanner;

public class TekrarHarf {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cümle giriniz: ");
        String cumle = scan.nextLine();

        System.out.println("Bir harf giriniz: ");
        char harf = scan.next().charAt(0);

        int harfSayisi = 0;

        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.substring(i, i + 1).equals(harf))

                harfSayisi++;

        }

        System.out.println(harf + " harfi " + harfSayisi + " defa tekrar etmiştir.");

    }
}