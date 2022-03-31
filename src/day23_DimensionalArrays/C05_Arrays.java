package day23_DimensionalArrays;


import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        //verilen bir array'e yeni bir element ekleyen bir method olusturun

        int arr[] = {3, 5, 7};
        // arr[3]=8; buna itiraz etmez ama konsol'da kabul etmez. Array'in uzunlugu 3 oldugu icin 4. bir
        //elemani bu sekilde eklemez
        //var olan bir array'e ayni boyutta bile olsa yeni eleman eklenmez
        arr = new int[4];
        System.out.println(Arrays.toString(arr));
        int arrYeni[]=new int[5];
        arr=arrYeni;
        System.out.println(arr);
        arrYeni[0]=2;
        arrYeni[3]=5;
        System.out.println(Arrays.toString(arr));

        //bir array'e iicnde hazir elementlerin oldugu yeni bir array atamak isterseniz bunu {1,2,3}
        //seklinde degil new int[3] seklinde olusturup sonra da deger atayarak
        //tamamladigimiz bir arry'i assign ederek yapabiliriz
        int arrEnYeni[]={1,2,3,4,5};
        arr=arrEnYeni;
        System.out.println(Arrays.toString(arr));



    }
}
