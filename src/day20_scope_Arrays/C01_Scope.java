package day20_scope_Arrays;

public class C01_Scope {
    //scope'a uymayan bir kullanimda java compile time error verir
    //bazi kaynaklarda 4 bazilarinda 5 scope mevcuttur.
    // 1-instance(object) variable

    //instance variable, claass in icinda ama main method'un disinda olusturulue

    int sayi;
    String bransIsmi = "Java";
    boolean okulAcikMi;

    public static void main(String[] args) {
        //sayi =10; sayi variable'i static olmadigi icin main method'dan
        //direkt kullanilamaz
        //instance variable'lara static method'lardan ulasabilmek icin
        //obje olusturmamiz gerekir
        C01_Scope obj1 = new C01_Scope();
        System.out.println(obj1.sayi);//0 yazdiirr, cunku deger atanmadi
        obj1.sayi = 10;
        System.out.println(obj1.sayi);//her iki degeri de yazdirir
         C01_Scope obj2 = new C01_Scope();
        System.out.println(obj2.sayi);//obj2 olusturulsa dda gidip obj2'ye
        //deger atanmis mi bakar, yoksa 0 olarak yazdirir

        System.out.println(obj2.bransIsmi);//java'nin burayi yazdirma mantigi,
        //obj iki hangi class'in altinda oraya cikar. obj2.bransIsmi'ye deger atanmis mi buraya gelene
        //kadar bakar. eger yoksa bransIsmi yazan yere(main method'un disina) cikar.
        //eger orda bir atama varsa alir ve onu yazdirir. yani "java" yazdirir
        //deger atanmamissa default yapar ve null yazdirir


    }


}

