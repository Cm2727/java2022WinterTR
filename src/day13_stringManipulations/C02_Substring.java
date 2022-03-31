package day13_stringManipulations;

public class C02_Substring {
    public static void main(String[] args) {

        //1-48 of 104 results for "nutella"
        //bu arama sonucundaki bulunan sonuc sayisi 100'den cok ise super
        //az ise "az sonuc bulundu"

        String str = "1-48 of 104 results for \"nutella\"";
        System.out.println(str);
        int ilkSpace = str.indexOf(" "); // java 4 verecek`,ilk space'i bul
        int ikinciSpace = str.indexOf(" ", ilkSpace + 1);//ilk space ten sonraki space'i bul
        int ucuncuSpace = str.indexOf(" ", ikinciSpace + 1);//ikinci space'ten sonrakini bul
        String aramaSonucSayisiStr = str.substring(ikinciSpace + 1, ucuncuSpace);

        int aramaSonucSayisiInt = Integer.valueOf(aramaSonucSayisiStr);

        if (aramaSonucSayisiInt > 100) {
            System.out.println("super");
        } else {
            System.out.println("az sonuc bulundu");
        }
    }
}
//sout'a substring 0 dersen bastan sona hepsini yazar
//10 yazarsan 10'dan sonrasini yazdirir
//karakter uzunlugundan daha fazla bir sayi yazarsaniz, hata verir
//iki paramatre kullanirsak, 1. paramatre dahil, ikincisi harictir.
//iki parametre esit ise (9,9) hiclik verir
//Ardisik iki parapetre yazarsak teksayi  yazar
//ilk parametre buyuk ikincisi kucuk ise(5,4) hata verir