package ebruMeryemFikriyeDilekSoruCozumu;

public class Soru2_FOnksiyonlariCagirma {
    public static int ucilecarp(int a){
        return a*3;
    }
    public static int ikitopla(int a){
        return a+2;
    }
    public static int dortcikar(int a){
        return a-4;
    }
    public static void main(String[] args) {
        //fonksiyonlari ci ice kullanma
        System.out.println("sonuc: "+dortcikar(ikitopla(ucilecarp(9))));
        //uc fonksiyonu ic ice kullanma

    }
}
