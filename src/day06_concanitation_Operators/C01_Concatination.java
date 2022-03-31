package day06_concanitation_Operators;

import javax.sound.midi.Soundbank;

public class C01_Concatination {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Guzel";
        int sayi1 = 5;
        int sayi2 = 3;

        //variablelerin degerlerini degistirmeden
        //asagidaki ifadeleri bu variableleri kullanarak yazdirin
        //Java5Guzel
        System.out.println(str1 + sayi1 + str2);

        //2Guzel15
        System.out.println(sayi1 - sayi2 + str2 + sayi1 * sayi2);

        //Java22
        System.out.println(str1 + (sayi1 - sayi2) + (sayi1 - sayi2));

        //53Guzel
        System.out.println(sayi1 + (sayi2 + str2));//ya da
        System.out.println("" + sayi1 + sayi2 + str2);//basta cift tirnak yazmak sonra gelen her seyi string e cevir demektir
          /*eger tamamen sayilardan olusan bir string varsa ve biz bunu
          intiger e cevirmek istersek
          Intiger.valueOf(str); yaziyoruz
          Bir sayiyi stringe cevirmek istersek de
          sayinin basina ya da sonuna "" eklenir(hiclik denir)
           */


    }
}
