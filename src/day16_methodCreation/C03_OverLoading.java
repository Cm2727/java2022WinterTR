package day16_methodCreation;


public class C03_OverLoading {
    public static void main(String[] args) {
        //verilen iki sayiyi toplayip yazdiran bir method olusturalim

        int sayi1 = 10;
        int sayi2 = 20;

        //bana bir sey dondurmeyecegi icin void olacak

        ikiSayiTopla(sayi1, sayi2);
        //iki double sayinin toplamini olusturan bir method yazalim
        double sayi3 = 15.2;
        double sayi4 = 10.3;

        ikiSayiTopla(sayi3, sayi3);
        //eger var olusturmadan direkt sayilari yazip method call yaparsam
        //parantez icine yazan neyse onun turunden getirir
        //bir int ve bir double toplamini olusturan bir method olusturalim
        int sayi5 = 3;
        double sayi6 = 3.2;
        ikiSayiTopla(sayi5, sayi6);//en uyumlu methodu secer
        //yukaridaki islemin ilk degeri int ve onu double konteynirinda yazabiliriz,
        //java da bunu bilir ve sayiyi double formunda yazabilir, bu yuzden ilk methodu calistiri


    }

    private static void ikiSayiTopla(int sayi3, double sayi4) {
        System.out.println("iki double toplami " + (sayi3 + sayi4));


    }

    private static void ikiSayiTopla(double sayi3, double sayi4) {
        System.out.println("iki double toplami " + (sayi3 + sayi4));

    }

    private static void ikiSayiTopla(int sayi1, int sayi2) {
        System.out.println("iki intiger toplami: " + (sayi1 + sayi2));

    }
}
//bir class ta ayni isimede farkli parametreleri olan methodlari
// olusturursak buna overloading denir
//overloading nasil yapilir?-java ayni isim ve ayni parametreye sahip
// birden fazla mehod olusturulmasina isin vermez
//Burda method signature denir. Bu method isimi ve argumentten olusur.
//
