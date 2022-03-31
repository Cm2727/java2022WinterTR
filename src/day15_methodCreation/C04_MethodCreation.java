package day15_methodCreation;

import java.util.Scanner;

public class C04_MethodCreation {

    public static void ucHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(2) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);
        System.out.println("girdiginiz kelimedeki harf sayisi 3'tur");
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);


    }

    public static void dortHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(3) +
                kelime.substring(2, 3) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);
        System.out.println("girdiginiz kelimedeki harf sayisi 4'tur");
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }

    public static void besHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(4) +
                kelime.substring(3, 4) +
                kelime.substring(2, 3) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);
        System.out.println("girdiginiz kelimedeki harf sayisi 5'tur");
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }

}


