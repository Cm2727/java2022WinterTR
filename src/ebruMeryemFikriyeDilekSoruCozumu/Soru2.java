package ebruMeryemFikriyeDilekSoruCozumu;

import java.util.Locale;
import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("P,S,C harflerinden birini giriniz");
        String harf = scanner.next().toUpperCase();
        if (harf.equals("p")) {
            System.out.println("pazartesi, pazar, persembe");

        } else if (harf.equals("s")) {
            System.out.println("sali");
        } else if (harf.equals("c")) {
            System.out.println("carsamba, cuma,cumartesi");
        } else System.out.println("hatali giris");
    }
*/

        //switc case ile cosumu
        Scanner scanner = new Scanner(System.in);
        System.out.println("P,S,C harflerinden birini giriniz");
        String harf = scanner.next().toLowerCase();
        switch (harf) {
            case "p":
                System.out.println("pazartesi, pazar, persembe");
                break;
            case "c":
                System.out.println("carsamba, cuma,cumartesi");
                break;
            case "s":
                System.out.println("sali");
                break;
            default:
                System.out.println("hatali giris");
        }

    }

}

/*Scanner scanner = new Scanner(System.in);
        System.out.println("P,S,C harflerinden birini giriniz");
        String ilkHarf= scanner.next().toUpperCase();
        if(ilkHarf.equals("P"))
        {
            System.out.println("pazar, pazartesi, persembe");
        }else if(ilkHarf.equals("s")){
            System.out.println("sali");
        }else if(ilkHarf.equals("c")){
            System.out.println("cuma, cumartesi");
        }else{
            System.out.println("hatali giris");
        }*/