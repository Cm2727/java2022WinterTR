package day03_scanner;

public class C03_SwapVariablesTempOlmadan {
    public static void main(String[] args) {
        int sayi1 = 30;
        int sayi2 = 20;
        System.out.println("Swaptan once sayi 1:" + sayi1 + " " + "sayi2:" + sayi2);
        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;
        System.out.println("Swaptan sonra sayi 1:" + sayi1 + " " + "sayi2:" + sayi2);
    }
}

