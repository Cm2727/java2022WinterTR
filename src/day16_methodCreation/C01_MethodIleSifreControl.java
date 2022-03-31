package day16_methodCreation;

public class C01_MethodIleSifreControl {
    public static void main(String[] args) {
        // Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa "Sifre basari ile tanimlandi",
        //sartlari saglamazsa "Islem basarisiz,Lutfen yeni bir sifre girin" yazdirin
        // - Ilk harf buyuk harf olmali
        //- Son harf kucuk harf olmali
        // - Sifre bosluk icermemeli
        // - Sifre uzunlugu en az 8 karakter olmali

        //bu dort kontrolu method ile yapin
        String sifre="MAlem4lik";
        boolean ilkHarfKontrol=ilkHarfControlEt(sifre);
        boolean sonHarfKontrol=sonHarfControlEt(sifre);
        boolean boslukKontrol=boslukKontrolEt(sifre);
        boolean uzunlukKontrol=uzunlukKontrolu(sifre);

        if (ilkHarfKontrol && sonHarfKontrol && boslukKontrol && uzunlukKontrol){
            System.out.println("Sifre basari ile tanimlandi");
        } else {
            System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
        }
    }

    private static boolean uzunlukKontrolu(String sifre) {
        boolean uzunlukKontrolSonucu=false;

        if(sifre.length()>=8){
            uzunlukKontrolSonucu=true;
        }else{
            System.out.println("sifre en az 8 karakter olmali");
        }
        return uzunlukKontrolSonucu;
    }

    private static boolean boslukKontrolEt(String sifre) {
        boolean boslukKontrolSonucu=false;
        if(!sifre.contains(" ")){
            boslukKontrolSonucu=true;
        }else{
            System.out.println("sifre bosluk icermemeli");
        }
        return boslukKontrolSonucu;
    }

    private static boolean sonHarfControlEt(String sifre) {
        boolean sonHarfSonuc=false;
        char sonHarf=sifre.charAt(sifre.length()-1);
        if(sonHarf>='a' && sonHarf>='z'){
            sonHarfSonuc=true;
        }else{
            System.out.println("son harf kucuk harf olmali");
        }
        return sonHarfSonuc;
    }

    private static boolean ilkHarfControlEt(String sifre) {
        char ilkHarf=sifre.charAt(0);
        boolean ilkHarfSonuc=false;


        if(ilkHarf>='A' && ilkHarf<='Z'){
            ilkHarfSonuc = true;//2-yukaridaki boolean true olsaydi bu anlamsiz olurda
            //bunu eklemezdin 1'dekini aktive ederdinn
        }else{
            System.out.println("Ilk harfi buyuk yaziniz");
           // ilkHarfSonuc = false;=>1-yukarida da boolean da ilkharf false olursa
            //yazdigi icin bunu yzsan da yazmasan da olur.Kod yine istenen gibi calisir
        }
        return ilkHarfSonuc;
    }
}

//4 tane acces modifier vardir.
//1-public; halka acik
//2-Private ;ozel, sadece bulundugu class'da kullanilabilir
//3-protected:sadece icinde bulundugu package and child class'larda kullanilir
//4-default;sadece icinde bulundugu package'da kullanilabilir

//method olustururken parantez icine yazilan degerlere arguments denir
//
