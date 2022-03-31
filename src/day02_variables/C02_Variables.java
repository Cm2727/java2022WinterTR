package day02_variables;

public class C02_Variables {
    public static void main(String[] args) {
        //eger istersek bir variable'i once declare edip sonra deger atayabiliriz
        String okulIsmi;
        //java deger atamasi yapmadigimiz bir variable olusturmamiza itiraz etmz
        //ancak deger atamasi yapincaya kadar o variable'i kullanmamiza izin vermez
        //bu yuzden buraya System.out.println(okulIsmi); yazamazsin
        //bir yerde hata varsa ya onu degistirmelisin ya da yoruma almalisin
        //aksi takdirde hic bir kodun calismaz


        okulIsmi = "Yildiz Koleji";
        System.out.println(okulIsmi);

        okulIsmi = "Star Koleji";
        System.out.println(okulIsmi);
        //Java calismaya main metoddan baslar.
        //sonra yukaridan asagi, soldan saga dogru calisir
        okulIsmi = "Java Koleji";
        System.out.println(okulIsmi);
    }
}
