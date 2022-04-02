package day32_dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println(tarihSaat);

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MMM/YYYY");

        System.out.println(formatter.format(tarihSaat));//31/Mar/2022

        DateTimeFormatter formatterSaat=DateTimeFormatter.ofPattern("h:mm:ss a");

        System.out.println(formatterSaat.format(tarihSaat));//9:56:52 ÖS
    }
}
