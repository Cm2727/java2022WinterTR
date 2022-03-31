package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        //Ternary ile yapilan tum islemler if- else ile de yapilabilir
        //if else yerine ternary tercih etme sebebi:
        //yapinin basit ve anlasilabilir olmasidir
        //Ternary icersinde complex kodlar olmaz
        //sadece sonuc veya bizi sonuca goturen basit islemler olabilir

        //kullanicidan bir tam sayi alip tek mi cift mi yazdiran bir kod yazalim
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz.");
        int sayi = scan.nextInt();
        //bu kodun if li hali
        /*if(sayi%2==0){
            System.out.println("sayi cift");
        }else{
            System.out.println("sayi tek");
        }*/
        //bu da ternary hali
        System.out.println(sayi % 2 == 0 ? "sayi cift" : "sayi tek");
    }
}
