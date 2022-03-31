package day09_ternary_Switch;

public class C04_NestedTernary {
    public static void main(String[] args) {
        //verilen sayinin pozitif mi negatif mi oldugunu kontrol edin
        //0 veya pozitif sayi ise tek veya cift
        //negatif sayi ise -100'den buyuk veya kucuk
        //oldugunu belirleyen bir ternary yaziniz
        int sayi = 99;
        if (sayi >= 0) {
            if (sayi % 2 == 0) {
                System.out.println("sayi pozitif cift");
            } else {
                System.out.println("sayi pozitif tek");
            }

        } else {
            if (sayi < 100) {
                System.out.println("sayi-100 den kucuk negati");
            } else {
                System.out.println("sayi -100'den buyuk negatif");
            }
        }
        String sonuc = sayi >= 0 ?
                (sayi % 2 == 0 ? "pozitif cift sayi " : "pozitif tek sayi") :
                (sayi < -100) ? "-100'den kucuk negatif sayi" : "-100'den buyuk negatif sayi";
        System.out.println(sonuc);
    }
}
