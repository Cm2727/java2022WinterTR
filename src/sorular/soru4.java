package sorular;

import java.util.Scanner;

public class soru4 {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String pin = "Gazi.2727";
        int girisHakki = 4;

        while (true) {
            System.out.println("Lütfen pin kodu:");
            String girilenPin = scan.nextLine();

            if (pin.equals(girilenPin)) {

                System.out.println("Giris basarili");
                break;
            } else {
                System.out.println("giris yanlis oldu");
                girisHakki--;
                System.out.println("Kalan giris hakkiniz :" + girisHakki);
            }
            if (girisHakki == 0) {
                System.out.println("size taninan giris hakki sona erdi.");
                break;
            }

        }


    }
}
