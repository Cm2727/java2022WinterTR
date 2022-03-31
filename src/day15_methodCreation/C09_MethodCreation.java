package day15_methodCreation;

public class C09_MethodCreation {
    public static void main(String[] args) {
        //main method baska yerden cagrilmaz,
        //class ta olmali

        String isim = "Meryem";
        String soyisim = "Aydin";
        String kKNo = "1234567890891234";

        String gizlenmisIsimSoyisim = isimSoyisimGizle(isim, soyisim);

        System.out.println(gizlenmisIsimSoyisim); //
        String gizlenmisKKNo = krediKartiGizle(kKNo);
        System.out.println(gizlenmisKKNo);
        //bizim temel amacimiz yazdirmak degil, yapilan degisiklikleri o haliyle yazmaktir
        //paramin 100 euro sunu gonderiyorsam, karsi tarafin 100 artmasi, bendekinden de 100 dusmesi lazim
        //bunu yapabilmektir
        // bir kodu yazdiriyorsak void ile yaopariz
        //eger bir metoddan bir islem yapmasini ve yaptigi islemi bize getirmesini istersek
        //return type void degil,
        //bize getirecegi sonucun data turunden olmalidir
        //  isimSoyisimGizle(isim,soyisim); bu kodda isim ve soyismin gizlenmis halini getirmesini
        //istiyorum. bekledigin donus String olur
        //public static void buradaki void yerini -isim istedigimizde- String olmalo
        //public static String seklinde degismeli
        //hangisi daha kullanisli sorusunun cevabi: bizden istenen ne ise en kullanisli olan odur
    }

    public static String isimSoyisimGizle(String isim, String soyisim) {
        String yeniIsim = isim.substring(0, 1).toUpperCase() +
                isim.substring(1).replaceAll("\\S", "*");

        String yeniSoyisim = soyisim.substring(0, 1).toUpperCase() +
                soyisim.substring(1).replaceAll("\\S", "*");
        //method olusturmada 3. adim method calisinca sadece bir sey mi yazdiracak
        //yoksa bize bir data mi dondurecek,buna karar vermektir
        //return type'i void degil string sectik ve sonuna return yeniSoyisim+ " " + yeniSoyisim; yazdik
        return yeniSoyisim + " " + yeniSoyisim;

    }


    public static String krediKartiGizle(String kKNo) {
        String yeniKkNo = "**** **** **** " + kKNo.substring(12);
        return yeniKkNo;
    }
}
