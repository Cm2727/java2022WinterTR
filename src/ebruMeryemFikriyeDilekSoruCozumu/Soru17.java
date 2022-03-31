package ebruMeryemFikriyeDilekSoruCozumu;

public class Soru17 {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
        //Program çalışır.
        //İstenilen sayı 0'sıfırdan büyük mü diye bakılır.
        //
        // - Eğer sıfırdan büyük ya da eşitse :
        //    --Sayı olduğu gibi yazılır.
        //
        // - Eğer 0'dan küçük ise :
        //    -- Sayının negatif olduğunu biliyoruz. Sayıyı pozitif yapmak için sayı "-1" ile çarpılır.
        //    -- Çarpım sonucundaki çıkan sayı konsola yazdırılır.
        //
        //Program kapanır.
      int sayi=0;
        System.out.println(sayi>=0 ? sayi : sayi*-1);

    }
}
