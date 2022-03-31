package day23_DimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {
        //kullanicidan  kac elementlik bir aarray olusturacagini sorun
        //array i olusturup elementleri kullanicidan alip
        //array' e atayin

        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen kac elementli bir array istediginizi yazin");
        int uzunluk=sc.nextInt();//buraya 5 yazarsa

        int arr[]=new int[uzunluk];//[0,0,0,0,0] yazar
        for(int i=0; i<arr.length; i++){
            System.out.println("Array icin "+(i+1) + " . elemani giriniz");
            arr[i]=sc.nextInt();

        }
        System.out.println(Arrays.toString(arr));


    }
}
