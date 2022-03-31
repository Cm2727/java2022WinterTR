package day23_DimensionalArrays;

import java.util.Arrays;

public class C06_Arrays {
    public static void main(String[] args) {
        //verilen bir array'e yeni bir element ekleyen bir method olusturun

        int arr[] = {3, 5, 7,2,5};
        int eklenecekElement=6;

        arr=arrayeElemanEkleMethodu(arr, eklenecekElement);
        //bir array donsun, ben de onu eski arrayime atayayim ve eski arrayim artik yeni olsun
        arr=arrayeElemanEkleMethodu(arr, 11);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] arrayeElemanEkleMethodu(int[] arr, int eklenecekElement) {

        int yeniArray[]=new int[arr.length+1];//yeni arrayim[0,0,0,0]
        for(int i=0;i<arr.length;i++){
            yeniArray[i]=arr[i];

        }
        yeniArray[yeniArray.length-1]=eklenecekElement;


        return yeniArray;



    }
}
