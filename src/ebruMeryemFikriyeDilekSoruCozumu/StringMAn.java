package ebruMeryemFikriyeDilekSoruCozumu;

public class StringMAn {
    public static void main(String[] args) {


        String fullName = "";
        System.out.println(fullName);

        //bastaki ve sondaki bosluklari silme
        String trimedName = fullName.trim();
        System.out.println(trimedName);

        //bir stringin bos olup olmadigini anlamak icin
        int numOfChar = fullName.length();
        if (numOfChar == 0) {
            System.out.println("isminizi girmediniz");

        } else {
            System.out.println("isminizi basariyla girdiniz");
        }

        boolean isEmpty = fullName.isEmpty();

        if (isEmpty) {
            System.out.println("isminizi girmediniz");

        } else {
            System.out.println("isminizi basariyla girdiniz");
        }

        String str1 = "Meryem 36 wuhuu";
        //isBlank sadece space karakter icin true false doner
        boolean bosluk = str1.isBlank();
        System.out.println(bosluk);//str'da cumle oldugu icin false doner


        String str = " ";//burasi true donmeli
        boolean isBlank = str.isBlank();
        System.out.println(isBlank);
    }
}