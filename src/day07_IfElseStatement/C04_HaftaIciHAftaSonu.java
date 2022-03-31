package day07_IfElseStatement;

import java.util.Scanner;

public class C04_HaftaIciHAftaSonu {
    public static void main(String[] args) {
        //kullanicidan gun ismi alin hafta ici veya hafta sonu oldugunu yazdirin

        //string case sensitieve dir.
        //PAzar in bir suru yazilis sekli vardir. Ama nasil yazarsa yazsin onun pazar oldugunu bilmemiz lazim
        //toLowerCase =kullanici nasil yazarsa yazsin onu kucuk harfe ceviriyoruz
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen gun ismini yaziniz");
        String gunIsmi = scan.next().toLowerCase();
        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println("Girdiginiz gun haftasonu");

        }

        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali")
                || gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") ||
                gunIsmi.equals("cuma")) {
            System.out.println("Girdiginiz gun haftaici");


        }


    }
}
