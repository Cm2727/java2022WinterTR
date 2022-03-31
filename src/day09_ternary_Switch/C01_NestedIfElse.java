package day09_ternary_Switch;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {
        // Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi 5’e
        // bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen
        // çift sayı” yazdırın. Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        // Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dort basamakli pozitif  bir tam sayi giriniz.");
        int num = scan.nextInt();
        if (num < 1000 || num > 9999) {
            System.out.println("Lutfen dort basamakli bir sayi giriniz.");
        } else if (num % 5 == 0) {

            if (num % 10 == 0) {//nested if-else
                System.out.println("Girdiginiz sayi cift sayidir.");
            } else {
                System.out.println("Girdiginiz sayi tek sayidir.");

            }
        } else {
            System.out.println("Tekrar deneyiniz.");
        }

    }
}
//bir yazilimciysan
//cok zeki ya da akilli olmaniza gerek yok
//sadece cok dikkatli olmalisiniz
//bunun icin de sizden ne isteniyorsa sadece onu yazin, zekanizi ortaya koymaya gerek yok
//ne azi ne de fazlasi
//bug nedir? kodun beklenmeyen davranisidir
//sen de bug olusturmaya sebep olmamalisin


