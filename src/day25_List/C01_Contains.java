package day25_List;

import java.util.ArrayList;
import java.util.List;

public class C01_Contains {
    public static void main(String[] args) {

        List<String> harfler=new ArrayList<>();

        //buraya eleman eklemek istiyorsak teker teker ekliyoruz
        harfler.add("D");//["D"]//ozel bir yer belirtmiyorsak sona ekler
        harfler.add("M");//["D, M"] sona eklemeye devam eder
        harfler.add(1,"T");//["D,T, M"] 1. index e ekler ve digerlerini saga kaydirir
        System.out.println(harfler);

        System.out.println(harfler.contains("T"));//true


        List<String> karakterler=new ArrayList<>();
        karakterler.add("M");
        karakterler.add("T");
        System.out.println(harfler.containsAll(karakterler));//harfler karakteri iceriyor mu
    }
}
