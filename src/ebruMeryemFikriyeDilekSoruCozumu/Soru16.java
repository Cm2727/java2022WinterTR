package ebruMeryemFikriyeDilekSoruCozumu;

import java.util.Scanner;

public class Soru16 {
    public static void main(String[] args) {
        //Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int a=scanner.nextInt();

        System.out.println((a%2==0) ? "cift sayi " : " tek sayi");
    }
}
