package day25_List;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] args) {
        //verilen bir arr den istenen elementi silip , kalanlari
        //yeni bir array olarak yazdiran method olusturun

        int arr[]={1,2,3,6,7,9,4};
        int istenmeyen=3;
        istenmeneyeniSil(arr,istenmeyen);

    }

    private static void istenmeneyeniSil(int[] arr, int istenmeyen) {
int sayac=0;
for (int i=0; i<arr.length; i++) {
    if(arr[i]==istenmeyen){
        sayac++;
    }


    int arrYeni[]=new int[arr.length-sayac];

    //int index=0;
    //for(int i=0; i<arr.length; i++) {
      //  if(arr[i]!=istenmeyen){
        //    arrYeni[index]=arr[i];
          //  index++;

        //}
    //}
    //System.out.println(Arrays.toString(arrYeni));
}

    }
}
