package day25_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ListtenIstenmeyenElementiSilme {
    public static void main(String[] args) {
        //verilen bir arr den istenen elementi silip , kalanlari
        //yeni bir array olarak yazdiran method olusturun

        int arr[]={1,2,3,6,7,9,4};
        int istenmeyen=3;

        istenmeneyeniSil(arr,istenmeyen);

    }

    private static void istenmeneyeniSil(int[] arr, int istenmeyen) {
        List<Integer> yeniList=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
             if(arr[i]!=istenmeyen){
                 yeniList.add(arr[i]);
             }

        }
        System.out.println(yeniList);
    }
}
