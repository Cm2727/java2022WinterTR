package day15_methodCreation;

public class C07_MethodCreation {
    public static void main(String[] args) {

        //java'nin run yapilabilmesi icin main method'a ihtiyaci var

        //string'i yazdiran bir method olusrualim


        //hosgeldiniz diyen bir method olusturun

        //kapanma mesaji yazan bir method olusturalim


        hosGeldinYazdirMethodu();

    }//methodlar arasinda gezerken, birinin icinden digerini cagirmaniz yeterlidir.
    //bunun icin de classin adi ile methodu cagirirsinie
    //kodu tekrar yazmaniza gerek yoktur

    static void kapanmaMethodu() {
        System.out.println("bizi tercih ettiginiz icin tesekkur ederim");
    }

    public static void hosGeldinYazdirMethodu() {
        System.out.println("Hosgeldin");
        stringYazdir("boyle de olur");
    }

    private static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMethodu();
    }
}
