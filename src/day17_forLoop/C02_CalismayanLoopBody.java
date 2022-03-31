package day17_forLoop;

public class C02_CalismayanLoopBody {
    public static void main(String[] args) {

        for (int i = 0; i > 10; i++) {
            //i'nin baslangic degeri 0, i>10 mu hayir, bu yuzden
            //loop calismadan durdu
            System.out.println("baslangic degeri bitis kosulunu saglamadigindan\n" +
                    "loop body'si hic calisamadan loop sona erdi");

        }
    }
}
