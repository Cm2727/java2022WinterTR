package day12_stringManipulations;

public class C02_LastIndexOf {
    public static void main(String[] args) {
        //kullanicidan bir cumle bir kelime isteyin
        //kelimenin cumledeki kullanimina bakarak
        //girilen kelime cumlede kullanilmamis
        //girilen kelime cumlede bir kere kullanilmis
        //girilen kelime cumlede 1'den fazla kullanilmis
        String cumle = "Java ogren, yeni program ile yeni bir sayfa ac";
        String kelime = "yeni";

        int ilkKulllanim = cumle.indexOf(kelime);//-1 ya da index cikar
        //eger -1 cikarsa hic kullanilmamis demektir

        int sonKullanim = cumle.lastIndexOf(kelime);//aramaya sondan baslar
        if (ilkKulllanim == (-1)) {
            System.out.println("girilen kelime cumlede kullanilmamis");
        } else if (ilkKulllanim == sonKullanim) {
            System.out.println("girilen kelime cumlede bir kere kullanilmis");
        } else {
            System.out.println("girilen kelime cumlede 1'den fazla kullanilmis");
        }

        String str = "Eclipse";
        System.out.println(str.lastIndexOf("p", 4));
//lastIndexOf=karakterin son kullanildigi yeri bulur
//indexi saymaya sondan baslamiyoruz, bastan basliyoruz
        //ama en sondaki karakteri verir size
        //mahkeme kelimesinde lastIndexOf ile m yi istedigimizde
        //index'i 5  olur ancak sondaki 'm' harfini verir bize
    }
}
