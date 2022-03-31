package day05_matematikselIslemler;

public class C01_PreIncrementPostIncrement {
    public static void main(String[] args) {
        int sayi = 10;
        //bu sayiyi bir arttirmak icin

        sayi++;
        System.out.println(sayi);

        sayi++;
        System.out.println("pre-incrementten once " + sayi);
        //bu 11 ve 12 deki iki islemi tek satirda yaparsam
        //java iki islemden once hangisini yapacagini bilmek ister
        //once arttirir sonra yazdirirsak java yeni degeri yazar
        //once yazdirir sonra arttirirsak, bu durumda eski degeri yazdirir

        System.out.println("pre-increment " + ++sayi);//once arrtis sonra yazdir
        System.out.println("pre-inc sonra " + sayi);
        System.out.println("post-increment satirinda " + sayi++);//once yazdir sonra arttir
        System.out.println("post-increment satirindan sonra " + sayi);


    }
}
