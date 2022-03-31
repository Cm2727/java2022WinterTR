package ebruMeryemFikriyeDilekSoruCozumu;

public class Soru_Overloading {
    public static void toplama(int a, int b, int c) {
        System.out.println("Toplamlari :"+ (a+b+c));

    }
    public static void toplama(int a, int b) {
        System.out.println("Toplamlari: " +(a+b));

    }
//sadece parametreleri farkli olan methodlara overloading/asiri yukleme  denir

    public static void main(String[] args) {
        toplama(3,4,5);
    }
}
