package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class C10_HuisWerk {
    public static void main(String[] args) {
        //kullanici bilgisayara 1 ile 100 arasinda bir sayi tutturun
        //kullanicidan bu sayiyi tahmin etmesin isteyin
        //girilen her tahminde sayiyi buyut veya kucult diye
        //kullaniciya yol gostern
        //kullanici sayiyi buldugunda
        //sayiyi bulana kadar kac tahminle sayiyi buldugunu kullaniciya yazdirin

        Random rnd = new Random();//random rastgele demektir
        int sayi = rnd.nextInt(100);//buraasi 100 den kucuk bir tam sayi demek
        Scanner scan = new Scanner(System.in);
        int tahmin = 0;
        int sayac = 0;
        while (sayi != tahmin) {//sayi tahmine esit
            System.out.println("lutfen bir sayi giriniz");
            tahmin = scan.nextInt();

            if (tahmin > sayi) {//tahmin sayidan buyuk
                System.out.println("daha kucuk bir sayi soylemelisin");

            } else if (tahmin < sayi) {//tahmin sayidan kucuk
                System.out.println("daha buyuk bir sayi soylemelisin");

            }

            sayac++;
        }
        System.out.println("tuttugum sayiyi " + sayac + " tahminde buldunuz");

    }
}
