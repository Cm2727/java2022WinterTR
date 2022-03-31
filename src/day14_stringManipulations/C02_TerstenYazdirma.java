package day14_stringManipulations;

import java.util.Locale;

public class C02_TerstenYazdirma {
    public static void main(String[] args) {
        //bir kelime isteyin ve kelimeyi tersten yazdirin
        String input = "Mavi";

        String tersStr = input.substring(3) +
                input.substring(2, 3).toLowerCase() +
                input.substring(1, 2).toLowerCase() +
                input.substring(0, 1).toLowerCase();
        System.out.println(tersStr);
    }
}
