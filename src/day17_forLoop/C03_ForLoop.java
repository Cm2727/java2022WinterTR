package day17_forLoop;

public class C03_ForLoop {
    public static void main(String[] args) {
        //ekranda 10 kez "Java guzeldir "yazdirin.

        for (int i = 1; i <= 10; i++) {
            //1'den baslamak istiyorsak int i=1
            //0'dan baslasin istiyorsak int i=0 yazariz
            //i<10 da kac defa yazdirmak istedigini belirtir
            System.out.println(i + "-Java guzeldir");
        }
        for (int i = 1; i <= 41; i++) {
            System.out.println(i + "-masallah");
            //i 1'den baslasin 41 e kadar gitsin, 41'i de dahil etsin
            //0'dan baslayip 10 'a kadar yazsin istersen
            // o zaman 11 tane yazar buna dikkat ediyoruz


        }
    }
}
