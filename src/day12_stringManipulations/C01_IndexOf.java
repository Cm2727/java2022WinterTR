package day12_stringManipulations;

public class C01_IndexOf {
    public static void main(String[] args) {
        //kullanicidan bir cumle bir kelime isteyin
        //kelimenin cumledeki kullanimina bakarak
        //girilen kelime cumlede kullanilmamis
        //girilen kelime cumlede bir kere kullanilmis
        //girilen kelime cumlede 1'den fazla kullanilmis
        String cumle = "Java ogren, yeni program ile yeni bir sayfa ac";
        String kelime = "ogren";

        int ilkKulllanim = cumle.indexOf(kelime);//-1 ya da index cikar
        //eger -1 cikarsa hic kullanilmamis demektir
        int ikinciKullanim = cumle.indexOf(kelime, ilkKulllanim + 1);

        if (ilkKulllanim == (-1)) {
            System.out.println("girilen kelime cumlede kullanilmamis");
        } else if (ikinciKullanim == (-1)) {
            System.out.println("girilen kelime cumlede bir kere kullanilmis");
        } else {
            System.out.println("girilen kelime cumlede 1'den fazla kullanilmis");
        }

    }
}
