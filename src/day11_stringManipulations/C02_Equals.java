package day11_stringManipulations;

public class C02_Equals {
    public static void main(String[] args) {
        String str1 = "Ali Can";
        String str2 = "Ali" + " Can";

        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);

        System.out.println("== ile karsilastir : " + (str1 == str2));
        System.out.println("equals ile karsilastir : " + str1.equals(str2));

        String str3 = str1 + "";
        System.out.println("str3 : " + str3);
        System.out.println("== ile karsilastir : " + (str3 == str2));
        System.out.println("equals ile karsilastir : " + str3.equals(str2));
        //string de == her zaman dogru sonucu vermez
        //bunun icin emin oldugumuz equals method'unu kullanmayi tercih ederiz
        //equals= iki metin birbirine esitligi kontrol etmek icin kullanilir

        String str5 = "hasan";
        String str6 = "HASAN";

        System.out.println(str5.equals(str6));
        System.out.println(str5.toUpperCase().equals(str6));

    }
}
