package day11_stringManipulations;

import java.util.Locale;
import java.util.Scanner;

public class C04_Length {
    public static void main(String[] args) {


        //kullanicidan ismini alip bas harfini ve son harfini
        //buyuk harflerle yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("ilk HArf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son harf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length() - 1));

        String str1 = "";
        System.out.println(str1.length());//0 yazdiri

        String str2 = null;
        System.out.println(str2);
        System.out.println(str2.length());//calistiginda hata verir
        //null ile isaretlenmis bir variable'in degerini yazdirmaya kalkarsak hata verir
        String str3;
        // str2 ve str3' deger atanmamis oluyor,

    }
}
