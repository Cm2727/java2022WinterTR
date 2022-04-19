package day48;

import java.util.HashSet;
import java.util.Set;

public class C01 {
    public static void main(String[] args) {
        
        Integer arr[]={3,5,4,6,3,1,2,7,8,6,1,4,2,8};
        arrayiTekrarsizYazdir(arr);
        
    }

    private static void arrayiTekrarsizYazdir(Integer[] arr) {
        Set<Integer> tekrarsizElementKümesi=new HashSet<>();
        for (Integer each :arr
             ) {tekrarsizElementKümesi.add(each);

        }
        System.out.println(tekrarsizElementKümesi);
    }


}
