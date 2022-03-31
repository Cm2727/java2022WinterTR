package day21_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String arr1[] = {"Ali", "Veli", "Ayse"};
        //array icindeki elementlere ulasabilmek icin index kullaniriz
        System.out.println(arr1[0]);//arr1 e gidip 0. indexteki Ali'yi yazdirir
        arr1[1] = "Esila";
        System.out.println(arr1[1]);//veli'yi oldurur yerine Esila yazdirir
        //arrayin icindeki indexi kullanarak elementlere ulasabilir ve update edebiliriz
        int arr2[] = new int[4];
        System.out.println(arr2[1]);//0
        System.out.println(arr2[3]);//0
        //System.out.println(arr2[5]);//ArrayIndexOutOfBoundsException-hata verir

        //array'in tamamini yazdirmak istersek
        //System.out.println(arr2);arraylar non-primitiev oldugundan direkt yazdirmak istrsek
        //java referans bilgisni yazdiri,

        for (int i = 0; i < 4; i++) {
            System.out.print(arr2[i] + " ");//yan yana dort tane sifir yazdirmasini bekliyoruz
            //array'i yazdirmak icin java'daki arrys calss'indan toString() kullanilir
        }
        System.out.println("");
        System.out.println(Arrays.toString(arr2));//for loop ile ugrasmadan boyle cagiririz

        arr2[1] = 11;
        arr2[3] = 22;
        System.out.println(Arrays.toString(arr2));//[0,11,0,22]

        System.out.println(Arrays.toString(arr1));//[Ali,Esila,Ayse]

         //array olustururken uzunlugu yazmazsaniz compile time error verir
        //"n" array'in lenght'i olmak uzere myArray[n-1] son elementi gosterir
        //bir array'da olmayani isterseniz hata verir
    }
}
