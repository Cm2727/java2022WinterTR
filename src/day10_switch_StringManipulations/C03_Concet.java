package day10_switch_StringManipulations;

public class C03_Concet {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "Candir";
        //java Candir yazdiralim
        System.out.println(str1 + " " + str2);
        String cumle = str1.concat(str2);
        cumle = str1.concat(" ").concat(str2);
        System.out.println(cumle);
        //concat icine string degil de sayi veya boolean yazdirilir mi?
        //sonuc=isim.concat(" ").concat(soyisim);
        //System.out.println(sonuc);
    }
}
