package day04_dataCasting_Increment;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        char ilkHarf = scan.next().charAt(0);
        //charAt index metodu parametre olarak yazdigimiz indexdeki chari bize getiri
        //String 'de index 0'dan baslar
        System.out.println("Girdiginiz ismin ilk harfi:" + ilkHarf);
    }
}
