package ebruMeryemFikriyeDilekSoruCozumu;

import java.util.Scanner;

public class Soru9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("gun ismi gir");
        String gunIsmi = scan.next().toLowerCase();

        if (gunIsmi.equals("pazartesi") ||gunIsmi.equals("sali") || gunIsmi.equals("carsamba")||gunIsmi.equals("persembe")
                || gunIsmi.equals("cuma")||gunIsmi.equals("cumartesi")||gunIsmi.equals("pazar")){
            System.out.println(""+gunIsmi.toUpperCase().charAt(0)+
                    gunIsmi.toLowerCase().charAt(1)+ gunIsmi.toLowerCase().charAt(2));
        }else{
            System.out.println("Gecerli bir gun ismi yaziniz");
        }
    }
}
