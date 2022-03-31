package ebruMeryemFikriyeDilekSoruCozumu;

public class Soru_FonksiyonlarlaDongu {
    public static int toplama(int a, int b, int c){//ben method'umu baska yerde de kullanmak istiyorum,
        //yani toplama islemini, bu deger vermiyor, sadece ekrana yaziyor. Buna void denir.
        //eger bana soonucu yani deger direkt verseydi o zaman her yerde kullanabilirdim

    return (a+b+c);//method'u cagirdigim yere bu islemi dondur, getir
    }

    public static void main(String[] args) {

        System.out.println("fonksiyonlardan donen deger: "+ toplama(3,4,5));
    }
}
