package day24_List;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>();
        isimler.add("neva");
        isimler.add("meryem");
        isimler.add("aile");
        isimler.add("tarik");
        System.out.println(isimler);

        //isimler.remove("aile");//burda true doner. Aileyi buldum oldurdum der ama
        //true ya da false goremeyiz
        //System.out.println(isimler);
        //true false'i yazsin istiyorsak
        boolean sonuc= isimler.remove("aile");
        if(sonuc==true){
            System.out.println("istediginiz isim silindi");
        }else System.out.println("istediginiz isim listede yok");
        System.out.println(isimler);

        sonuc= isimler.remove("televizyon");
        if(sonuc==true){
            System.out.println("istediginiz isim silindi");
        }else System.out.println("istediginiz isim listede yok");
        System.out.println(isimler);

    }

}

