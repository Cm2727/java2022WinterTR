package ebruMeryemFikriyeDilekSoruCozumu;

import java.util.Scanner;

public class Soru11 {
    public static void main(String[] args) {
        //Kullanicidan 100 uzerinden notunu isteyin.
        // Not’u harf sistemine cevirip yazdirin.
        // 50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”,
        // 80’nin uzerinde ise “A”
        Scanner scan=new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        double not= scan.nextDouble();

        if(not<=49){
            System.out.println("D");

        }else if(not>=50 && not<=59){
            System.out.println("C");
        }else if(not>=60 && not<=79){
            System.out.println("B");
        }else if(not>=80 && not<=100){
            System.out.println("A");


    }else{
            System.out.println("gecerli bir not giriniz");
        }
    }
}
