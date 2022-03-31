package day19_WhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
        //kullanicidan bir sayi alin
        //bu sayiyi tam bolen sayilari
        //ve toplam kac tane olduklarini ekrana yazdirin

        int input = 30;
        //for loop ile de yapilabilir ama biz while loop ile
        //yapalim
        int bolen = 1;
        int sayac = 0;
        while (bolen <= input) {
            if (input % bolen == 0) {
                System.out.print(bolen+ " - ");
                sayac++;

            }
            bolen++;
        }
        System.out.print(bolen + " ");
        System.out.print(input + " sayini bolen " + sayac + " adet sayi vardir");
    }
}