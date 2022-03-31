package day15_methodCreation;

public class C06_MethodCreation {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //iki variable'in degerlerini toplayan bir method olusturalim

        //1.adim :method adini yazalim
        //2.adim:methoda gondermem gereken arguman var mi? varsa ekle
        ikiSayiTopla(a, b);//burasi olmazsa main methodun sonu gelir ve calismaz,
        //bu yuzden bunun ekli olmasi gerekir
        C04_MethodCreation.dortHarfiTersineCevir("sema");
    }
    //bir methodu olusturmak calismasi icin yeterli degildir
    //method ancak cagirilirsa calisir
    //ayni class veya farkli class ta olmasinin hic bir onemi yok
    //java main method da yukaridan asagiya dogru calisir
    //ve geldigi satiri calistirir

    //ikiSayiTopla(a,b); bu da method un cagirilmasidir
    private static void ikiSayiTopla(int a, int b) {
        System.out.println("verilen iki sayinin toplami= " + (a + b));
    }
}
