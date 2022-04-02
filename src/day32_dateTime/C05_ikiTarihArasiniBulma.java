package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_ikiTarihArasiniBulma {
    public static void main(String[] args) {
        LocalDate bugun=LocalDate.now();
        LocalDate dogumGunu=LocalDate.of(1988,02,01);

        System.out.println(Period.between(dogumGunu,bugun));//P34Y1M30D

        System.out.println(Period.between(dogumGunu,bugun).getYears());//34





    }


}
