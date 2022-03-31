package ebruMeryemFikriyeDilekSoruCozumu;

import java.util.Scanner;

public class Soru14 {
    public static void main(String[] args) {
        //Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
        // Girdiği sayi 5’e bölünüyorsa son rakamını kontrol edin.
        // Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
        // Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        // Girdiği sayi 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
        Scanner scan=new Scanner(System.in);
        System.out.println("Dort basamakli bir sayi giriniz");
        int sayi=scan.nextInt();
     if( sayi%5==0){

         if(sayi%10==0){
                System.out.println("5e bulunen cift sayi");
            }else {
                System.out.println("5e bolunebilen tek sayi");
            }

     }else{
         System.out.println("hatali giris");
     }
    }
}
//      Scanner scan=new Scanner(System.in);
//        System.out.println("lutfen 4 basamaklı bir sayı giriniz");
//        int sayi=scan.nextInt();
//        if (sayi%5==0) {
//            if (sayi%10==0) {
//                System.out.println("5' e bolunen cift sayi");
//            } else {
//                System.out.println("5' e bolunen tek sayi");
//            }
//        }else {
//            System.out.println("girdiginiz sayı 5 e bolunmuyor");
//        }
