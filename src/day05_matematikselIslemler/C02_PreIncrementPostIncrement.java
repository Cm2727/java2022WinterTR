package day05_matematikselIslemler;

public class C02_PreIncrementPostIncrement {
    public static void main(String[] args) {
        System.out.println();
        int a = 15;
        int b = a++;
        System.out.println(b);
        //once aasignment, sonra arttirma
        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;

        sayi2 = sayi1++;

        System.out.println(sayi1 + ", " + sayi2 + ", " + sayi3);

        sayi3 = ++sayi1;
        System.out.println(sayi1 + ", " + sayi2 + ", " + sayi3);

        System.out.println(sayi3++);//once yazdir, sonra arttir. Yani consola 12 yazar
        System.out.println(sayi3);
        System.out.println(--sayi2);

    }
}
