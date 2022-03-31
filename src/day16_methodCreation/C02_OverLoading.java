package day16_methodCreation;

public class C02_OverLoading {
    public static void main(String[] args) {


        String str = "bu da gecer ya HUU";
        System.out.println(str.indexOf("d"));
        System.out.println(str.indexOf("a", 5));
        System.out.println(str.substring('a', 5));
        //bir class te  ayni isimden birden fazla ùmethod varsa buna overloading denir
        //ya parametre sayisi farkli olmai,
        //ya da parametre sayisi ayni ise argumentlerin data turleri farkli olmali
    }
}
