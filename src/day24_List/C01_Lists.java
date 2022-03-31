package day24_List;

import day23_DimensionalArrays.C06_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {
        int arr[]={};
        //bu array'e 5 ekleyelim

        arr=C06_Arrays.arrayeElemanEkleMethodu(arr,5);
        System.out.println(Arrays.toString(arr));

        arr=C06_Arrays.arrayeElemanEkleMethodu(arr,3);
        System.out.println(Arrays.toString(arr));
        //bir list olusturulacagi zaman
        //ArrayList<String> list=new ArrayList<String>(); ' kullaniyoruz
        //ya da List<String> list=new ArrayList<>(); =>en cok kullandigimiz da budur

        //sout' a list3 yazinca yazdirmis oluyoru


        //bir list olusturalim
        List<Integer> list1=new ArrayList<Integer>();
        System.out.println(list1);

        list1.add(5);
        list1.add(3);
        list1.add(6);
        list1.add(8);
        list1.add(9);
        list1.add(2,7);
        list1.add(4,7);
        System.out.println(list1);
    }
}
