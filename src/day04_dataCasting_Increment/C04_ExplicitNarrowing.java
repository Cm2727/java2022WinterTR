package day04_dataCasting_Increment;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {


        int sayi1 = 879;
        double sayi2 = 10;

        double sayi3 = sayi1 / sayi2;
        System.out.println(sayi3);

        int sayi4 = (int) (sayi1 / sayi2);
        //bu islemin sonucu parantez ici int yazilmazsa java kabuletmez.
        //kabul etmesi icin parantez ici int yazilir ve sorumluluk bende denir ve java kodu kabul eder.

        System.out.println(sayi4);

        int sayi5 = 140;
        byte sayi6 = (byte) sayi5;//sag taraftaki deger int buyuktur sol taraftaki variable byte tan.bunu kabul etmesi icin parantez icine byte yazilir
        System.out.println(sayi6);

        sayi5 = 140;
        sayi6 = (byte) sayi5;
        System.out.println(sayi6);

        sayi5 = 129;
        sayi6 = (byte) sayi5;
        System.out.println(sayi6);

        sayi5 = 260;
        sayi6 = (byte) sayi5;
        System.out.println(sayi6);

        sayi5 = 520;
        sayi6 = (byte) sayi5;
        System.out.println(sayi6);


    }
}
