package day34_accessModifier_encapsulation;

public class C04_Encapsulation {
    public static void main(String[] args) {
        C03 obj=new C03();

        System.out.println(obj.getSayi());//0

        obj.setStr("Java Java Java");

        System.out.println(obj.getStr());//Java Java Java

        System.out.println(obj); //sayi=0, str='Java Java Java

    }
}
