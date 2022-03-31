package day05_matematikselIslemler;

import javax.sound.midi.Soundbank;

public class C06_WrapperClass {
    public static void main(String[] args) {


        String str1 = "12345";
        String str2 = "23456";
        //verilen 2 String'deki sayilari toplayin


        System.out.println(str1 + str2);
        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));


    }
}
