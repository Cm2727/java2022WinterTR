package ebruMeryemFikriyeDilekSoruCozumu;

public class TamBolenleriniBulma {
    public static void main(String[] args) {
        //Bir sayının tam bölenlerini ve tam bölenlerinin toplamını bulun.



        int sayi=30;
        int bolen=1;
        int tamBolenlerinToplami=0;

        while (bolen<sayi){
            if(sayi%bolen==0){
                System.out.println(sayi+ " sayisi "+ bolen+ " sayisina tam bolunur");
                tamBolenlerinToplami+=bolen;

            }
            bolen++;

        }

        System.out.println("bu sayinin bolenlerinin toplami = " +tamBolenlerinToplami);








    }
}
    /*
    int sayi=60;
    int bolen=1;
    int tamBolenlerinToplami=0;

    while(bolen<=sayi){
    if(sayi % bolen==0){
        System.out.println(sayi+" sayısı "+bolen+" sayısına tam bölünür.");
        tamBolenlerinToplami = tamBolenlerinToplami+bolen;
    }
    bolen++;
    }
        System.out.println("\n"+sayi+" sayısının tam bölenlerinin toplamı: "+tamBolenlerinToplami);*/