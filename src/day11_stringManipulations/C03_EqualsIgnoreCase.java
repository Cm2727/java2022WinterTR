package day11_stringManipulations;

import java.util.Scanner;

public class C03_EqualsIgnoreCase {
    public static void main(String[] args) {

        //kullaniciya derse katilip katilmak istemedigini sorun
        //evet derse, cevabini ve "derse katiliminiz alinmistir" yazdirin
        //hayir derse cevabini ve "sonraki dersleimize bekleriz" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println(" Derse katilmak ister misin ? \n Evet ya da Hayir yaziniz");
        String cevap = scan.next();

        if (cevap.equalsIgnoreCase("Evet")) {
            System.out.println("cevabiniz : " + " " + cevap + "." + "Derse katiliminiz onaylanmistir");

        } else if (cevap.equalsIgnoreCase("Hayir")) {
            System.out.println("cevabiniz : " + " " + cevap + "." + "Sonraki dersimize bekleriz");

        } else {
            System.out.println("Lutfen evet ya da hayir yaziniz");
        }

    }
}
