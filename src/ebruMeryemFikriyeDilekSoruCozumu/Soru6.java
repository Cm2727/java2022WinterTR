package ebruMeryemFikriyeDilekSoruCozumu;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("harf gir");
        char harf=scan.next().charAt(0);
        if(harf>='a' && harf<='z'){
            System.out.println("harf" );

        }else if(harf>='A' && harf<='Z'){
            System.out.println("harftir");
        }else{
            System.out.println("hatali giris");
        }
    }
}
