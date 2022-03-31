package day12_stringManipulations;

public class C05_Replace {
    public static void main(String[] args) {
        String str = "Bugun ne cok sey ogrendik";

        //bu cumlede bosluk disindaki karakter sayisini bulunuz
        System.out.println(("space haric karakter sayisi : " + str.replace(" ", "").length()));//length yazmazsak Bugunnecokseyogrendi der
        //atama yapilmadigi surece orijinal string kalici olarak degismez
        //sadece o satir icin degisiklik yapilip sonuc yazdirilmis olur
        System.out.println("orijinal karakter sayisi : " + str.length());
        //str de kalici degisiklik yapalim
        //bugun yerine yarin
        //ogrendik yerine ogrenecegiz

        str = str.replace("Bugun", "Yarin");
        str = str.replace("ogrendik", "ogrenecegiz");

        System.out.println("kalici degisiklikten sonra : " + str);
        str = str.replace("ne cok", "ne az");
        System.out.println(str);
    }
}
//bununla kelimeyi baska seyle degistirebilirsin; kelimelerin icindeki tum 'a'
//harflerini silebilirsin
//char icin de kullanilabilir
