package day07_IfElseStatement;

import java.util.Scanner;

public class C05_IfELse {
    public static void main(String[] args) {
        //if-else statementslerde if bodysi dogru ise else kismina hic gecmez, if yanlissa els kismini calistiri
        //if-else kullaniliyorsa iki sart vardir.
        //sadece if olursa da tek sart tek sonuc vardi.

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen gun ismini yaziniz");
        String gunIsmi = scan.next().toUpperCase();

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println("Girdiginiz gun haftasonu");

        } else {
            System.out.println("girdiginiz gun hafta ici");
        }

    }
}
