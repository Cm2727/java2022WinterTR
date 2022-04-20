package day48_map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_ListeyiDüzenliYazdirma {
    public static void main(String[] args) {

        //

        Map<Integer, String> sinif= MapOlustur.myMap();
        System.out.println(sinif);
        sinifListYazdir(sinif);

    }

    private static void sinifListYazdir(Map<Integer, String> sinif) {
        System.out.println("Numara Isim Soyisim Brans");
        System.out.println("=========================");

        //Map yapisinda yazdirdigimizda bir sey anlamayabilir
        //Bunun icin mao yapisini kodlarla manipule edip
        //map'deki datalari istedigimiz formata sokmamiz gerekir
        //1. adim key ve value lari mapten alip
        //iki farkli collections uyesine atadik

        Set<Integer> keySet=sinif.keySet();
        Collection<String> valueSet=sinif.values();

        System.out.println(keySet);
        System.out.println(valueSet);
        System.out.println(valueSet.size());

        for (String each:valueSet
             ) {
            System.out.println(each);

        }


    }
}
