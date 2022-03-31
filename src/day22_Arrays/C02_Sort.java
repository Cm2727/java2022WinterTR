package day22_Arrays;
import java.util.Arrays;
public class C02_Sort {
    public static void main(String[] args) {
        //verilen bir aary de ne kucuk ve e buyuk degerleri yazdirin
        int arr[]={3,5,6,1,9,0,45,25,4,9,0};
        //Arrays.sort(arr);
        //System.out.println(arr[0]);
       // System.out.println(arr[arr.length-1]);
        int enKucukSayi=Integer.MAX_VALUE;// arr[0];
        int enBuyukSayi=Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if(arr[i]<=enKucukSayi){
                enKucukSayi=arr[i];

            }
            if(arr[i]>enBuyukSayi){
                enBuyukSayi=arr[i];
            }
        }
        System.out.println("array'daki en kucuk sayi " + enKucukSayi);
        System.out.println("array'daki en buyuk sayi "+ enBuyukSayi);

        Arrays.sort(arr);
        System.out.println("array'daki en kucuk sayi " + arr[0]);
        System.out.println("array'daki en buyuk sayi "+ arr[arr.length - 1]);
    }
}
