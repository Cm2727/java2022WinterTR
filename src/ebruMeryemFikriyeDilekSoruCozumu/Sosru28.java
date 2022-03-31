package ebruMeryemFikriyeDilekSoruCozumu;

public class Sosru28 {
    public static void main(String[] args) {
        //Kullanicidan bir cumle ve bir kelime isteyin,
        // kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //- Girilen kelime cumlede kullanilmamis.
        //- Girilen kelime cumlede 1 kere kullanilmis.
        //- Girilen kelime cumlede 1’den fazla kullanilmis.
        String cumle="Agustosta dordumuz is sahibi olduk olduk";
        String kelime="olduk";
        System.out.println(cumle.indexOf(kelime));
        int ilkKullanim=cumle.indexOf(kelime);
        int ikinciKullanim=cumle.indexOf(kelime, ilkKullanim+1);
        if(ilkKullanim==(-1)){
            System.out.println("Girilen kelime cumlede  kullanilmamis.");
        }else if(ikinciKullanim==(-1)){
            System.out.println("Girilen kelime cumlede bir kere kullanilmismis.");
        }else{
            System.out.println("birden fazla kullanilmistir");
        }

    }
}
