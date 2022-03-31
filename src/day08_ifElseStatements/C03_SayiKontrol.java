package day08_ifElseStatements;

import java.util.Scanner;

public class C03_SayiKontrol {
    public static void main(String[] args) {
        //kullanicidan iki sayi isteyin
        //sayilarin ikisi de pozitifse sayilarin toplamini yazdirin
        //sayilarin ikisi de negatifse sayilarin carpimini yazdirin
        //sayilarin ikisi farkli isaretlere sahipse
        //"farkli isaretlerdeki sayilarla islem yapamzsiniz" yazdirin
        //sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("iki sayi giriniz");//bu aciklama olsa da olmasa da calisir ,
        // bunu konsoldaki kirmizi karenin aktif olmasindan anlariz
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        if (sayi1 > 0 && sayi2 > 0) {
            System.out.println("girdiginiz iki sayi pozitiftir, toplamlari= " + (sayi1 + sayi2));
        } else if (sayi1 < 0 && sayi2 < 0) {
            System.out.println("iki deger negatif oldugundan carpimlari =" + (sayi1 * sayi2));
        } else if (sayi1 * sayi2 < 0) {
            System.out.println("farkli isaretlerdeki sayilarla islem yapamazsiniz");

        } else System.out.println("sifir carpmaya gore yutan elemandir");

    }
}
