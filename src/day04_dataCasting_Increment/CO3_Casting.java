package day04_dataCasting_Increment;

public class CO3_Casting {
    public static void main(String[] args) {

        int sayi1 = 8;
        int sayi2 = 4;
        System.out.println(sayi1 / sayi2);
        sayi2 = 3;
        System.out.println(sayi1 / sayi2);

        sayi1 = 22;
        System.out.println(sayi1 / sayi2);
        //java 2int sayiyi birbirine bolerse sonuc tam sayi olur

        sayi1 = 4786;
        sayi2 = 10;
        sayi1 = sayi1 / sayi2;
        System.out.println(sayi1);

        sayi1 = sayi1 / sayi2;
        System.out.println(sayi1);

        sayi1 = sayi1 / sayi2;
        System.out.println(sayi1);

        sayi1 = 4895;
        double sayi3 = 10;
        //sayi1=sayi1/sayi3;//iki farkli sayi data turunu isleme koydugumuzda
        //java kucuk olan data turu icin oto widening yapar
        //bu islemi dusunursek islemin sonucunu double kabul eder
        //bu islemde sol taraf int sag taraf doubledir.
        System.out.println(sayi1 / sayi3);

    }
}
