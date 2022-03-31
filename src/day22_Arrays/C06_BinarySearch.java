package day22_Arrays;

import java.util.Arrays;

public class C06_BinarySearch {
    public static void main(String[] args) {
        //eger java'dan hazir  BinarySearch ile yapmak  istersen
        //once sort methodunu kullanip, sonra binarySearch yapmaliyiz
        //binarySearch methodu' bize istenen sayinin oldugu index'i verir

        int arr[] = {3, 5, 7, 1, 9, 54, 39};
        int istenenSayi=3;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[ 1, 3, 5, 7, 9, 39, 54];
        System.out.println(Arrays.binarySearch(arr,istenenSayi));//bize istenen elementin indexini verir
//eger olmayan bir elementi aratirsak,
        //java bulamadigini gostermek icin - isareti koyar
        //o sayi olsaydi siralamasi ne olacak ise o sirayi bize verirdi.
        //mesela burada [ 1, 3, 5, 7, 9, 39, 54]; 10 nerde olmali. 5. indexte olmaliydi ve olmadigi icin de degeri -1 olur
    }
}
