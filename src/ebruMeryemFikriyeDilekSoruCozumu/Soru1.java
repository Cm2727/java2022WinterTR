package ebruMeryemFikriyeDilekSoruCozumu;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir  sayi giriniz");
        int sayi=scan.nextInt();
        if(sayi%2==0){
            System.out.println("cift sayi");
        }else if(sayi%2!=0){
            System.out.println("tek sayi");
        }else System.out.println("hatali giris");

    }
}





/* Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi=scan.nextInt();
        if (sayi%2==0){
            System.out.println("cift sayi");
        }else if (sayi%2!=0){
            System.out.println("sayi tek");
        }else{
            System.out.println("hatali giris");
        }*/