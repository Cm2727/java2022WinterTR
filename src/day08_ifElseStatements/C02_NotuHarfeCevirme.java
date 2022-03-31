package day08_ifElseStatements;

import java.util.Scanner;

public class C02_NotuHarfeCevirme {
    public static void main(String[] args) {
        //kullanicidan 110 uzerinden notunu isteyin,
        //notu harf sistemine cevirip yazdirin
        //50'den kucukse "D",
        //50_60 araligindaysa "C",
        //60-80 araligindaysa "B",
        //80'in uzerindeyse "A" yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not = scan.nextDouble();
        if (not < 0 || not > 100) {//- bir not ya da 100 uzeri bir not girilmemesi icin
            //bizim icin en onemli sarti en basa koymaliyiz cunku java yukaridan asagi calisir
            //ilk buldugu true yu calistirir
            System.out.println("gecerli not giriniz");
        } else if (not < 50) {
            System.out.println("D");
        } else if (not >= 51 && not <= 60) {
            System.out.println("C");
        } else if (not >= 61 && not <= 80) {
            System.out.println("B");
        } else System.out.println("A");
    }
}//else ile bittigi icin mutlaka bir tanesi calisir
