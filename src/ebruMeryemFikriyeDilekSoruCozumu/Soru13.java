package ebruMeryemFikriyeDilekSoruCozumu;

import java.util.Scanner;

public class Soru13 {
    public static void main(String[] args) {
        //Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
        //Kullanicidan bir sifre girmesini isteyin
        //Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin.
        // Ilk harf A ise “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
        //  Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin.
        //  Ilk harf z ise “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Sifre giriniz");
        String sifre = scan.next();
        if(sifre.charAt(0) >='A' && sifre.charAt(0)<='Z'){
            if(sifre.charAt(0)=='A'){
                System.out.println("gecerli sifre");
            }else if(sifre.charAt(0)!='A'){
                System.out.println("gecersiz sifre");
            }
        }else if(sifre.charAt(0)>='a' && sifre.charAt(0)<='z'){
            if(sifre.charAt(0)=='z'){
                System.out.println("gecerli sifre");
            }else if(sifre.charAt(0)!='z'){
                System.out.println("gecersiz sifre");
            }

        }else {
            System.out.println("hatali giris");
        }

    }
}
