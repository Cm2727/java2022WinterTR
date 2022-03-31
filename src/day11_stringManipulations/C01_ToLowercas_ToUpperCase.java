package day11_stringManipulations;

import java.util.Locale;

public class C01_ToLowercas_ToUpperCase {
    public static void main(String[] args) {

        String str = "Java Guzeldir";
        //biz String methodlarini arka arkaya kullanabiliriz
        //mesela ikinci kelimenin ilk harfini kucuk yazdiralim

        //bunun sonucu artik char oluyor
        //dolayisiyla string'de yapmak istedigimiz tum degisiklikleri
        //once yapil sonra charAt() method'unu kullanmaliyiz

        System.out.println(str.toLowerCase().charAt(5));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));//JAVA GUZELDIR

        //Locale.forLAnguageTag()- listede olmayan dil icin kullanilir ve
        //parantez icine dilin kisaltilmis hali yazilir=tr gibi

    }
}
