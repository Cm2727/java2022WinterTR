package day11_stringManipulations;

import java.util.Scanner;

public class C05_IndexOf {
    public static void main(String[] args) {

        String str1 = "Java bir baska guzel";
        //istersk char olarak bir harfin indeksini bize donduru
        System.out.println(str1.indexOf('J'));//j'nin indeksi 0
        System.out.println(str1.indexOf("aska"));//bunu tek string gibi dusunup baslangic indeksini verir

        //istersek bir harf ya da metin olarak verdigimizi string'in indexini dondurur
        System.out.println(str1.indexOf('l'));

        System.out.println(str1.length() - 1);

        //ayni harften birden fazla varsa soldan saga ilk harfin indexini verir
        System.out.println(str1.indexOf("b"));


        System.out.println(str1.indexOf('b', 5));
        //5.indexe gider,ve ordan aramaya balar,5 de dahildir

        //verilen string'deki 2.a harfinin indexini bulalim
//once ilk a yi buluuruz
        int ilkindex = str1.indexOf('a');
        System.out.println(str1.indexOf('a', ilkindex + 1));

        int ilkindex2 = str1.indexOf("b");
        System.out.println(str1.indexOf("b", ilkindex2 + 1));
//olmayan bir harfi aratirsak
        System.out.println(str1.indexOf("y"));
        //yok demenin saysal karsiligi olarak java -1 dondurmeyi tercih eder
        //kullanicidan mail adresini iste
        //@ icermiyorsa gecersiz de
        //iceriyorsa gecerli kabul edildi de


        Scanner scan = new Scanner(System.in);
        System.out.println("mail adresi girin");
        String mail = scan.next();

        if (mail.indexOf("@") == (-1)) {
            System.out.println("gecersiz");
        } else {
            System.out.println("mailiniz kabul edildi");
        }


    }
}
