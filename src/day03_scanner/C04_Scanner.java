package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //Scanner kullanmak icin 3 adim takip edilir
        //1.adim kendinize bir Scanner olusturmak
        Scanner scan= new Scanner(System.in);
        //bu kodu ezberlemen gerekiyor
        //2.adim: kullanicidan istedigimiz degeri girebilmesi icin aciklayici bir bilgi yazin
        System.out.println("Lutfen isminizi giriniz");
      //3.adim; kullanicinin girdigi degeri, uygun bir veri olusturup kaydedin
        String kullaniciIsmi=scan.next();
        System.out.println("Kullanicinin girdigi isim:" + kullaniciIsmi);

    }
}
