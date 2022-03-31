package ebruMeryemFikriyeDilekSoruCozumu;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gun adi gir");
        String gunAdi= scanner.next();
        if (gunAdi.equalsIgnoreCase("cuma")){
            System.out.println("muslumana bayram");
        }else if (gunAdi.equalsIgnoreCase("cumartesi")){
            System.out.println("yahudiye bayram");
        }else if (gunAdi.equalsIgnoreCase("pazar")){
            System.out.println("hrsitiyanlara bayram");
        }else{
            System.out.println("deliye bayram");
        }
    }
}
