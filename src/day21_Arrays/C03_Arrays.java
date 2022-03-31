package day21_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

        int arr[];//deger atamasi yapmadik ama java kabul etti
        //bunu yazdirmak istersem java kabul etmez ve sout'unun alti cizili olur
        //yani int arr[];'i yazmani kabul etti ama kullanmana izin vermedi
        //ona deger atamana da izin vermez, o yuzden bunun kullaniminin mantigi yoktur
        //yani kaz deger alacagini belirtmezsen arr=int[6]; yazmana izin vermz
        //ancak bu sekilde kabul eder
        arr = new int[6];
        System.out.println(Arrays.toString(arr));//6 tane 0 yazdirir
        //array'in uzunlugu icin
        System.out.println(arr.length);//6 verir
        //stringdeki lenght'te parantez varken arr dekinde yoktur

        //arraydeki her bir elemani index degeri kadar arttiralim
        //0 0 0 0 0 0 i 0 1 2 3 4 5 olarak yazdiralim. SAdece 0 lari degistiriyoruz
        for (int i = 0; i < arr.length; i++) {
            arr[i] += i;
        }
        System.out.println(Arrays.toString(arr));
        //son indexteki elementi yazdiralim
        System.out.println(arr[arr.length - 1]);//5


    }
}
