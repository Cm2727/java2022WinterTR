package day06_concanitation_Operators;

public class C02_MantikOperatorleri {
    public static void main(String[] args) {

        System.out.println(5 + 2 == 8);

        boolean sonuc1 = 5 > 4 && 7 < 9 && 6 + 3 == 9 && 5 + 2 != 8;
        System.out.println(sonuc1);

        boolean sonuc2 = 5 > 4 && 7 > 9 && 6 + 3 == 9 && 5 + 2 != 8;
        System.out.println(sonuc2);


        boolean sonuc3 = 5 > 4 & 7 > 9 & 6 + 3 == 9 & 5 + 2 != 8;
        System.out.println(sonuc3);
        //&& ile & yazmanin arasindaki fark
        //and de bir tane bile false olursa sonuc false olur.
        //cift & de buldugu ilk false ta durur ve diger islemleri kontrol etmez ve
        //bu zaten false der ve isleme devam etmez.
        //tek & ise butun islemleri kontrol eder ve hepsini kontrol edene kadar durmaz. ama zaman ve hafizada yer kaybidir

        int sayi3 = 15;

        //sayi3'un' 10 ile 20 arasinda oldugunu true dondurerek ispatlayin.
        //java 3lu karsilastirma kabul etmez;3>2>1 gib
        //bunun icin 2'li karsilastirmalar yapip mantiksal operatorlerle birlestirmeliyiz
        //eger bir araliktan bahsediyorsak & kullaniriz

        System.out.println(10 < sayi3 && sayi3 < 20);

        int sayi4 = 5;
        //sayi4'un 10 ile 15 araliginda olmadigini true diyerek dondurun
        System.out.println(sayi4 < 10 || sayi4 > 20);
    }
}
