package day14_stringManipulations;

public class C03_StringSayiToplama {
    public static void main(String[] args) {
        //string seklinde erilen iki asagidaki fiyatlarin toplamini bulun
        //String str1=""$13.99"";
        //String str2="$10.55";
        //ipucu=Double.parseDouble

        String str1 = "$13.99";
        String str2 = "$10.55";
        str1 = str1.replaceAll("\\D", "");
        str1 = str2.replaceAll("\\D", "");

        double str1Sayi = Double.valueOf(str1);
        double str2Sayi = Double.valueOf(str2);

        double sonuc = (str1Sayi + str2Sayi) / 100;
        System.out.println("toplam: $" + sonuc);


    }
}
