package day19_WhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
        //kullanicidan bir sayi lain
        //bu sayilarin rakamlari toplamini yazdirin

        int input=7659;
        int rakam=0;
        int rakamlarToplami=0;

        while (input>0){
            rakam=input%10;
            rakamlarToplami +=rakam;
            input/=10;
        }
        System.out.println(rakamlarToplami);
    }
}
