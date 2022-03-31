package day10_switch_StringManipulations;

import java.util.Locale;

public class C04_CharAt {
    public static void main(String[] args) {
        //string' de herhangi bir karakteri almak istedigimizde
        //o harfin indexini kullanarak
        //str.charAt(istenenIndex) yazabiliriz
        String str = "Java cok guzel";
        // J'yi yazdirmak istiyorsak, J ilk sirada oldugu icin
        System.out.println(str.charAt(0));
        //g'yi yazdirmak istiyorsam,harf 9.sirada oldugu icin
        System.out.println(str.charAt(9));
        //va yazdirmak istiyorsak
        System.out.println("" + str.charAt(2) + str.charAt(3));
        //str.charAt(2)+ str.charAt(3) bu sekilde yazdirilirsa 215 getiri.
        //char i matematiksel isleme sokunca ASCI tablosuna gore sayi getirir
        //bunun onune gecmek icin basina  ""+ ekleriz
        System.out.println("" + str.toLowerCase().charAt(5) +
                str.toUpperCase().charAt(6) +
                str.toUpperCase().charAt(7));
        //son karakteri yazdir
        //string'de 14 harf var, son harf indexi 14-1
        System.out.println(str.charAt(14 - 1));//uzunluk-1
    }
}
