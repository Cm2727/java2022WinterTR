package day22_Arrays;

import java.util.Arrays;

public class C03_TerstenSiralayipKaydet {
    public static void main(String[] args) {
        int arr[]={3,5,6,1,9,45,25,4,9,0};
       arr=terstenSiraliHaleCevir(arr);
        System.out.println(Arrays.toString(arr));//bu artik kayitli ve buraya artik istedigin islemi uygulayabilirsin

       
       
       
    }

    private static int[] terstenSiraliHaleCevir(int[] arr) {
        Arrays.sort(arr);//[1, 3, 4, 5, 6, 9, 25, 45]once siraladik
        int tersArray[] = new int[arr.length];///sonra ayni uzunlukta degersiz bir array olusturduk[0, 0, 0, 0, 0, 0, 0, 0]

        for(int i = 0; i < tersArray.length; i++){//sonra da terten yazdirdik
            tersArray[i]=arr[arr.length-1-i];
            // [45, 25, 9, 6, 5, 4, 3, 1]
        }
       return tersArray;

    }
}
