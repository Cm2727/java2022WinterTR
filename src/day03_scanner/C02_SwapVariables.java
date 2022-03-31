package day03_scanner;

public class C02_SwapVariables {
    public static void main(String[] args) {
        //verilen sayi1  ve sayi2 variablelerinin degerlerini degistiren (SWAP) bir program yaziniz


        int sayi1 = 10;
        int sayi2 = 20;
        System.out.println("Swap'tan once sayi1:" + sayi1 + ",sayi2:" + sayi2);

        int temp = sayi1;
        sayi1 = sayi2;
        sayi2 = temp;
        //esitligin sol tarafi variable adi, sag taraf da deger
        System.out.println("Swap'tan sonra sayi1:" + sayi1 + ",sayi2:" + sayi2);

    }
}
