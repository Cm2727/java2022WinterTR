package day04_dataCasting_Increment;

public class C05_IncrementDecrement {
    public static void main(String[] args) {

        int sayi = 20;
        System.out.println(sayi + 10);//burda sadece 1à fazlasini yazdirma var
        System.out.println(sayi);

        sayi = sayi + 10;
        System.out.println(sayi);
        System.out.println(sayi = sayi += 10);//burda hem atama hem de yazdirma var
        System.out.println(sayi);//sayimin degeri bir ust satira gore 40 olarak degisti
        System.out.println(sayi += 10);//burda da hem sayiya deger ataniyor hem de islem yapiliyor
        System.out.println(sayi);//sayinin degeri artik 50

        //bir variablenin degerini kalici olarak arttirmak ya da azaltmak isterseniz assigment sart

        System.out.println("bu ne oldu?:" + sayi++);//
        System.out.println(sayi);

        System.out.println("Son satir:" + ++sayi);
        System.out.println(sayi);
    }
}
