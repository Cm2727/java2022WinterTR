package day07_IfElseStatement;

import java.util.Scanner;

//eger kullanici gun ismini yanlis girerse "yanlis girdiniz" de
public class C07_IfElseIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz");

        //coklu if else te once yapiyi yaz ki hata yapma. YAni if , else suslu parantezlerini
        // parantezlerini yazdiktan sonra bilgileri gir
        String gunIsmi = scan.next().toLowerCase();

        if ((gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi"))) {
            System.out.println("girdiginiz gun hafta sonu");
        } else if ((gunIsmi.equals("pazartesi") || gunIsmi.equals("sali")
                || gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") ||
                gunIsmi.equals("cuma"))) {
            System.out.println("Girdiginiz gun hafta ici");

        } else {
            System.out.println("girdiginiz gun isminden baska her seye benziyor");

        }
    }
}
