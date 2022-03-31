package day10_switch_StringManipulations;

import java.util.Scanner;

public class C01_StringMAnipulations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci ay oldugunu giriniz");
        int ayNo = scan.nextInt();
        //bu soruyu if else ile yapabiliriz ama uzun surer
        //cok kalabalik ve anlasilmasi guc olur
        //bunun yerine switch-case yapisini kullanabiliriz
        //switch-case'te break gorene kadar yazmaya devam eder. bu yuzden durmasini istediginiz
        //yerde break; yazmaniz lazim
        switch (ayNo) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayis");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Agustos");
                break;
            case 9:
                System.out.println("Eylül");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasim");
                break;
            case 12:
                System.out.println("Aralik");
                break;
            //if else'deki gibi geriye kalanlar icin else durumu yazilabilir
            //onun adi da default: tur
            default:
                System.out.println("Lutfen gecerli bir ay numarasi giriniz");
        }
    }
}