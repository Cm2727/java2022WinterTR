package day07_IfElseStatement;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {
        //kullanicidan yasini isteyin,
        //65 veya daha buyukse emekli olabilirsin
        //65'ten kucukse emekli olmazsin yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriiz");
        int yas = scan.nextInt();
        if (yas >= 65) {
            System.out.println("emekli olabilirsi");
        } else {
            System.out.println("emekli olamazsin");
            System.out.println(65 - yas + "sene daha calismalisin");
        }
        //if else durumlarindan sadece biri calisabilir.
        // Ayni anda ikisi calismaz
        //ikisinin de calismama ihtimali yok,

    }
}
