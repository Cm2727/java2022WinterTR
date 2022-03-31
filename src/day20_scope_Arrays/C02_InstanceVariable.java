package day20_scope_Arrays;

public class C02_InstanceVariable {
    //class icinde veya baska class'larda direkt kullanilmaz,
    //kullanmak istedigimuzde mutlaka object olusturulmali
    //ve onject uzerinden ulasilmalidir

    int sayi;//inst varable
    char ilkHarf;//inst varable
    String isim;//inst varable
    boolean ogrenciMi;//inst varable
    //bunlara ulasmak icin de ......


    public static void main(String[] args) {

        //burada object olusturulmalidir.
        //obje nasil olustururlur;
        //1-class ismi
        C02_InstanceVariable ex1=new C02_InstanceVariable();
        System.out.println(ex1.sayi);//sayi var 'a deger atanmamaissa int oldugu icin 0 degeri verir
        System.out.println(ex1.ilkHarf);//ilkHarf'e deger atanmamissa, char'in default degerini hiclik olarak verir
        System.out.println(ex1.isim);//String isim'e deger atanmasi yoksa stringin default degeri null
        System.out.println(ex1.ogrenciMi);//buraya deger atamasi yoksa boolean da false yazdirir

    }
}
