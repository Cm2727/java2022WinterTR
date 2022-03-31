package day02_variables;

public class C01_Variables {
    public static void main(String[] args) {
        //bir variable olustururken icerisine koyacagimiz datanin
        //alabilecegi degerlere uygun bir data turu secmeliyiz
        //ornegin bir sehrin nufusundan bahsediyorsak
        //variable'mizin data turu  string, boolean, char veya double olmaz
        //geriye kalan tammsayi turlerin sehrin nufusunu icine alabilecek buyuklukte bir data turu secebiliriz
        //kursta tam sayilar icin int, ondalikli sayilar icin double kullanacagiz
        System.out.println("Hello World yazdiran Java'yi halleder.");
        int level = 1;
        System.out.println(level);
        boolean ogrenciMi = true;

        boolean yagisVarMi = false;
        System.out.println(ogrenciMi);
        char ozelSembol = '&';
        char sayi = '2';
        char harf = 'a';
        System.out.println(harf);
        System.out.println(sayi);
        System.out.println(yagisVarMi);
        System.out.println(ozelSembol);
    }
}
