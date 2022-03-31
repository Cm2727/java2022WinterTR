package day23_DimensionalArrays;

import java.util.Scanner;

public class C07_MDArrays {
    public static void main(String[] args) {
        //kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin.
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=sc.nextLine();
        String arr[]=cumle.split(" ");
        System.out.println("Girdiginiz cumledeki kelime sayisi : "+ arr.length);
    }
}
