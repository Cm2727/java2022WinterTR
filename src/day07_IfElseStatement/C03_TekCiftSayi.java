package day07_IfElseStatement;

import java.util.Scanner;

public class C03_TekCiftSayi {
    public static void main(String[] args) {
        //soru -1-kullanicidan bir tam sayi isteyin sayinin tek veya cift oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dort basamakli bir tam sayi giriniz");
        int sayi = scan.nextInt();
        if (sayi % 2 == 0) {
            System.out.println("girilen sayi cift sayidir");
        }
        if (sayi % 2 != 0) {
            System.out.println("girilen sayi tek sayidir");
        }
        // ya da
        // if (sayi%2 == 0){
        //            System.out.println("girilen sayi cift sayidir");
        //        }
        //       else{
        //            System.out.println("girilen sayi tek sayidir");
        //        }

    }
}
