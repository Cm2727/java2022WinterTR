package day13_stringManipulations;

public class C01_Substring {
    public static void main(String[] args) {
        String str = "Java ile IT cok guzel";
        System.out.println(str.substring(5));//5. index'ten sonrakileri yazdiracak
        //yukaridakini "memet hoca ile IT cok guzel" ile degistir
        System.out.println(str.replace("Java", "mehmet hoca"));
        System.out.println("mehmet hoca " + str.substring(5));
        System.out.println(str.substring(9));//yazilan index inclusive

        //eger bir index'ten sona kadar olan parcayi degil
        //belirli bir parcayi almak istersek
        //iki parametre yazmak gerekir
        //str.substring(baslangicIndexi,bitisIndexi)
        //baslangic indexi ==> inclusieve/dahil
        //bitis indexi ==> ecclusive/haric

        System.out.println(str.substring(0, 5));//0'dan baslar ancak 5'i dahil etmez
        System.out.println(str.substring(0, 1));//ilk harfi tek al
        //5. harfi string olarak bul
        //bu normalde charAt ile gelir ancak String olarak getirmez,
        //bu yuzden substring kullanilmali
        str = "Java gun gectikce guzellesiyor";

        System.out.println(str.substring(7, 7));//hiclik dondurur
        //System.out.println(str.substring(5,2));bitis indexi baslangictan kucuk oldugu icin hata verir

        System.out.println(str.substring(str.length() - 1));//son harfi verir
        System.out.println(str.substring(str.length() - 5));//son 5 harfi yazdiralim
        System.out.println(str.substring(str.length()));//hiclik yazdirir
    }
}
//kendime notlar
//replaceAll==> String str="Java'da rakamlar 0123456789";
//System.out.println(str.replaceAll("a","*"));=>butun a'larin yerine yildiz yazar
//System.out.println(str.replaceAll("\\s","*"));=>s-space =>butun spacelarin yerine yildiz yazar
//System.out.println(str.replaceAll("\\S","*"));=>S-space olmayan=>space olmayanlarin hepsini yildiz yap
//System.out.println(str.replaceAll("\\w","*"));=>w-harf ve rakam=>harf ve rakam olaranlarin tamamini yildiza cevir
//System.out.println(str.replaceAll("\\W","*"));=>W-harf ve rakam olmayan=>harf ve rakam olmayanlarin hepsini yildiza cevir
//System.out.println(str.replaceAll("\\d","*"));=>d-rakamlar=>rakamlarin yerine yildiz yaz
//System.out.println(str.replaceAll("\\D","*"));=>D-rakam disindaki her sey=>rakamlarin disindaki her seyin yerine yildiz yaz
