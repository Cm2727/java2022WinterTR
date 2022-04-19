package day45_interfaces;

public interface I01_Default_Static {



    void method1();

    public default void method2(){
        System.out.println("Interface'deki default method");
    }

    static void method3(){
        System.out.println("Interface'deki static method");
    }



}
