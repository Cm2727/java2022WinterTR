package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate trh =LocalDate.now();//
        LocalDate baskaTrh=LocalDate.of(1988,2,1);
        //is

        System.out.println(trh);
        //

        System.out.println(trh.getYear());
        System.out.println(trh.plusMonths(9).plusDays(10));//2023-01-10


        //

        LocalDate trhZone=LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone); // 2022-04-01

        //is ile baslayan
        System.out.println(LocalDate.now().isLeapYear());//false
        System.out.println(trh.isAfter(baskaTrh));//true









    }


}
