package day25_List;

import java.util.ArrayList;
import java.util.List;

public class C04_ListedenTekrarliElementleriSilme {
    public static void main(String[] args) {
        //listedeki tekrar eden sayilari sadece 1 kere yazdiran bir method olustur
        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);
        tekrarsizListe(sayilar);
    }

    private static void tekrarsizListe(List<Integer> sayilar) {

    }
}
