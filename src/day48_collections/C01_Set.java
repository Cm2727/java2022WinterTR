package day48_collections;

import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {

        //verilen bir array'in tekrar eden elementlerin
        //sadece bir kere yazdiran bir method olusturun


        Integer arr[]={3,5,4,6,3,1,2,7,8,6,1,4,2,8};
        arrayiTekrarsizYazdir(arr);
        
    }

    public static void arrayiTekrarsizYazdir(Integer[] arr) {

        Set<Integer> tekrarsizElementK├╝mesi=new HashSet<>();
        for (Integer each :arr
             ) {tekrarsizElementK├╝mesi.add(each);

        }
        System.out.println(tekrarsizElementK├╝mesi);

    }
}
