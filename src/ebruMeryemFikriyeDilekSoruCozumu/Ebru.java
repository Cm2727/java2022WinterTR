package ebruMeryemFikriyeDilekSoruCozumu;
import java.util.Scanner;
public class Ebru {
    public static void main(String[] args) {
//Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari
        //toplayip, sonucu yazdiran bir program yaziniz
        Scanner scan = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz.");

        int sayiBirinci = scan.nextInt();

        System.out.println("ikinci sayıyı giriniz.");

        int sayiIkinci = scan.nextInt();

        int toplam = 0;

        for (int i = sayiBirinci; i <= sayiIkinci; i++) {



                toplam = toplam + i;


        }

        System.out.println("İki sayı arasındaki sayıların toplamı : " + toplam);



    }
}


        //Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari
        //toplayip, sonucu yazdiran bir program yaziniz
        /*Scanner scan=new Scanner(System.in);
        int sayi1,sayi2,temp,toplam=0;
        System.out.println("Lütfen 1. sayıyı giriniz:");
        sayi1=scan.nextInt();
        System.out.println("Lütfen 2. sayıyı giriniz:");
        sayi2=scan.nextInt();
        while(sayi1==sayi2){
            System.out.println("Lütfen 2. sayıyı 1. sayıdan farklı giriniz:");
            sayi2=scan.nextInt();
        }
        if(sayi1>sayi2){
            temp=sayi1;
            sayi1=sayi2;
            sayi2=temp;
        }
        while(sayi1<=sayi2){
            toplam=toplam+sayi1;
            sayi1++;
        }
        System.out.println("Toplam="+toplam);
    }
}

*/




              /*  int baslangic=scan.nextInt();
                System.out.println("Lutfen ikinci sayiyi giriniz");
                int bitis=scan.nextInt();

                int toplam=0;

                int toplam = 0;

        for (int i = 1; i <= sayiAdedi; i++) {
            System.out.println("lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            toplam += sayi;
{
                    System.out.print( " ");
                    toplam= toplam +i;
                    System.out.println("Sayilarin toplami : " + toplam);
*/


