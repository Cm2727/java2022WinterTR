package day22_Arrays;

public class C08_Split {
    public static void main(String[] args) {
        //verilen bir cumlede istenen harfin kac defa kullanildigini yazdiran
        //bir method yazdiralim
        
        String cumle="nerede o gunler?";
        String harf="e";
        
        harfKacKereKullanilmis(cumle, harf);
        
    }

    private static void harfKacKereKullanilmis(String cumle, String harf) {
        int sayac=0;
        String harfStr=""+harf;//stringe cevirme
        String karakterler[]=cumle.split("");
        for (int i=0; i<karakterler.length; i++){
            if(karakterler[i].equals(harfStr)){
                sayac++;
            }
        }
        System.out.println("aradiginiz harf : "+ harf +" verilen cumlede " +sayac + "adet kullanilmistir");
    }
}
