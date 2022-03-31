package ebruMeryemFikriyeDilekSoruCozumu;

public class Soru19 {
    public static void main(String[] args) {
        //Kullanicidan bir tamsayi alin ve sayi 10’dan kucukse
        // “Rakam” , 100’den kucukse “iki
        //basamakli sayi”degilse “uc basamakli veya daha buyuk
        // sayi” yazdirin
        int sayi=155;
        System.out.println(sayi<10 ? "rakam": sayi<100 ? "iki basamakli"
                : "uc basamakli veya daha buyuk");
    }
}
