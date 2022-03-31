package ebruMeryemFikriyeDilekSoruCozumu;

public class Soru_Overloading_skorHesaplama {
    public static void skorHesaplama(String name, int score){
        System.out.println( name+ " isimli oyuncunun puani: "+score);
    }
    public static void skorHesaplama(int score){
        System.out.println( " isimsiz oyuncunun puani: "+score);
    }
    public static void skorHesaplama(String name){
        System.out.println( name+ " isimli oyuncunun puani: 0");
    }

    public static void main(String[] args) {
skorHesaplama("Meryem",3000);
skorHesaplama(1000);
skorHesaplama("Mariia");
    }

}
