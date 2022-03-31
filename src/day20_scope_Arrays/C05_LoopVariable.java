package day20_scope_Arrays;

public class C05_LoopVariable {

    public static void main(String[] args) {


        int sayi=10;
        for (int i = 1; i <=10;i++){
            System.out.println(sayi);//burdaki sayi'nin alti cizilmesin istiyorsak
            //int sayi'yi  int sayi; bu sekilde degil int sayi=10; bu sekilde yazmaliyiz
            //static var her yere girer ama static olmayanlari kabul etmez
            //static olmayanlar static olmayanlari kabul eder
            //local var'lar ister statik olsun ister olmasin sadece kendi class inda kullanilir
            //loop scope'u loop un icinde olusturmussaniz loop'un disinda kullanamazsiniz
        }

    }
}
