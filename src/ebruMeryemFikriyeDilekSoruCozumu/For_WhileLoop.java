package ebruMeryemFikriyeDilekSoruCozumu;

import java.util.Scanner;

public class For_WhileLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("harf giriniz :");
        String harf = scan.next();

        String sesliHarfler = "aeiou"; //inglizce karakterleri aldim sadece, karisiklik olmasin diye..

        for (int i = 0; i < sesliHarfler.length(); i++) {
            if(harf.length()>1){
                System.out.println("birden fazla deger girdiniz, tekrar deneyiniz");

            }else if (sesliHarfler.toLowerCase().contains(harf.substring(0, 1))) {  //sesli harfler girilen kelimenin ilk karakterini iceriyor mu?
                //kullanici kelime girse bile ilk karaktere baksin..
                System.out.println("sesli harf");
                break; //sesli harfi bulunca aramaya devam etmesin, donguyu kirsin..
            } else {
                System.out.println("sessiz harf");
                break;
            }

        }
        System.out.println();
    }
}

//for (int i = 11; i <45;i++) {
//            if (i % 2 == 0) {
//                System.out.print(i + " - ");