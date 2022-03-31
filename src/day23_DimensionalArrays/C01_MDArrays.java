package day23_DimensionalArrays;

import java.util.Arrays;

public class C01_MDArrays {
    public static void main(String[] args) {
        int arr[][]={{3,1,7},{6,10,2}};

        System.out.println(arr[0][2]);
        System.out.println(arr[1][1]);
        //ilk inner arr tum elementlerini yazdirin
        System.out.println(arr[0]);//bu bir array oldugundan direkt yazdirilimaz
        System.out.println(Arrays.toString(arr[0]));// burda 3,1,7 yi yazdirir
        System.out.println(Arrays.toString(arr));//burda tum arraylerin referanslarini yazdirr
        //tum elementlerin hepsini yazdirmak istersek
        System.out.println(Arrays.deepToString(arr));//hepsini yazdirr
    }
}
