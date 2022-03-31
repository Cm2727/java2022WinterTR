package day14_stringManipulations;

import java.util.Locale;

public class C04_IsimGizleme {
    public static void main(String[] args) {
        //kullanicidan isim soyisim ve "kredi" karti bilgilerini al
        //asagidaki gibi yaz
        //isim-soyisim=M**** B****
        //kart no: **** **** **** 1234
        String isim = "Meryem";
        String soyisim = "Aydin";
        String kKNo = "1234567890891234";
        String yeniIsim = isim.substring(0, 1).toUpperCase() +
                isim.substring(1).replaceAll("\\S", "*");
        String yeniSoyisim = soyisim.substring(0, 1).toUpperCase() +
                soyisim.substring(1).replaceAll("\\S", "*");
        String yeniKko = "**** **** **** " + kKNo.substring(12);
        System.out.println("isim-soyisim: " + yeniIsim + " " + yeniSoyisim + "\n kart no= " + yeniKko);

    }
}
