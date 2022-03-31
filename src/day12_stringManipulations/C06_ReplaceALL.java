package day12_stringManipulations;

import java.util.Scanner;

public class C06_ReplaceALL {
    public static void main(String[] args) {
        //kullanicidan isim soyisim bilgisini alip
        //butun harfleri yildiz yapalim
        Scanner scan = new Scanner(System.in);
        System.out.println("isim soyisim yaziniz");
        String isimSoyim = scan.nextLine();

        System.out.println(isimSoyim.replaceAll("\\s", "*"));
    }
}
