package day09_ternary_Switch;

public class C05_Ternary {
    public static void main(String[] args) {
        //bazen ternary'deki iki sonucun data turleri farkli olabilir
        //verilen sayi 100'den buyukse sayinin karesini alip yazdiran
        //100'den kucukse "sayi 100 den buyuk olmali" yazdiran
        //bir ternary olusturalim
        int sayi = 50;
        //ternary bize sonuc getirdiginden ya sonucu direkt yazdirmaliyiz
        //veya bir degiskene atamaliyiz
        //eger sonuclar farkli data turlerindeyse
        //atama yapacagimiz variable'in data turu tek olmasi gerektiginden
        //atama yapamayiz
        //bu durumda sadece direkt yazdirabiliriz
        System.out.println(sayi > 100 ? sayi * sayi : "sayi 100'den buyuko olmali");
    }
}
