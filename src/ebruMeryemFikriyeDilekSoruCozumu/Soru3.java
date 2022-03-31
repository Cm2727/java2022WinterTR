package ebruMeryemFikriyeDilekSoruCozumu;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gun adi gir");
        String gunAdi=scanner.next();
        if(gunAdi.equalsIgnoreCase("pazar") || gunAdi.equalsIgnoreCase("cumartesi")){
            System.out.println("hafta sonu");
        }else if(gunAdi.equalsIgnoreCase("pazartesi") ||gunAdi.equalsIgnoreCase("sali")
        ||  gunAdi.equalsIgnoreCase("carsamba") || gunAdi.equalsIgnoreCase("persembe") ||
                gunAdi.equalsIgnoreCase("cuma")){
            System.out.println("hafta ici");

        }else{
            System.out.println("hatali giris");
        }
    }
}
