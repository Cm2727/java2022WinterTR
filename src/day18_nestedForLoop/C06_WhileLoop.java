package day18_nestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {
        //kullancidian iki tam sayi alip bu sayilari ve aralarindaki
        //tum tam sayilari yazdiran bir kod olusturun

        int baslangic=40;
        int bitis=60;
        for (int i=baslangic; i<=bitis;i++){
            System.out.print(i + " ");
        }
        System.out.println("");//diger kodlarin ustteki kodun yanina yazilmasini englellemek ici
        //bu kisma bir bos sout ln yazdirmayi unutmayalim

            int i=baslangic;
        //ayni soruyu while loop ile yapalim
        while (i<=bitis) {
            System.out.print(i+ " ");
            i++;
            // while (baslangic<=bitis) {
            //            System.out.print(baslangic+ " ");
            //            baslangic++;
            //baslangic++ kismini eklemezsek baslangic 40 ve bitis 60 tan kucuk,
            //suslu paranteze gelir ve kod biter konsola 40 yazar ve bunu surekli 40
            //olarak tekrar eder sonsuza kadar.Bu yuzden baslangic++; eklememiz lazim
        }
        System.out.println("");
        System.out.println(baslangic);
    }
}
