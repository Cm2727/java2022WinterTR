package day20_scope_Arrays;


public class C03_StaticVariables {
    //instance variable'lar obje'ye bagimlidir
    // ve her obje farkli degerler alabilir
    //ogrenci notlari ve
    //classta olustururlur
    //main method'un disinda olusturulur
    //variable'larin basina static yazilarak olusturulur'


    static String okulIsmi = "Yildiz Koleji";
    static int okulNo;
    static boolean okulAcikMi;

    public static void main(String[] args) {
        System.out.println(okulIsmi); //Yildiz Koleji
        System.out.println(okulNo); // 0
        okulNo = 102;
        System.out.println(okulIsmi); //102
        System.out.println(okulAcikMi);//false, cunku bir deger atamasi yazmadik

        staticMethod();
        System.out.println(okulNo);//burayi staticMethod'u olusturduktan saonra yazdik
        //burda bir defa degisiklik yaptin mi, her sey icin degisiklik olur
        //ve artik okul no 102 degil 200'dur

    }
    //yeni bir method olusturacaksam main method'un disina cikiyorum

    public static void staticMethod() {//buradan da main method'un icine
        //ulasilamaz. Ona ulasmak icin main method'un icine calismasini istedimiz
        //method'un adini yazmamiz yeterli.staticMethod();
        okulNo = 200;
        System.out.println(okulNo);//200
        //kodun calisma siralamasi 17,18,19,20,21,22,24,32,35,36,39, 25,
//Instance variable'lar objeye bagimlidir ve her obje
        //farkli degerler alabilir. Buna ornek olarak ogrenci notlari veya ogretmen
        //branslari diyebiliriz.
        //bir objeye ait bir variable'in son degerini bula icin sadece o objeye dikkat
        //ederiz.
        //static var'larda ise class variable olarak tanimlanir.
        //ve tum class uyeleri icin aynidir. Okul ismi ,okul mudurunun adi gibi

        //eger static variable'in degeri degistirilirse herkes icin degisir
    }

}
