package day32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        LocalTime tm=LocalTime.now();
        System.out.println(tm); //21:09:57.598641100

        int sayi=0;
        for (int i = 0; i <100000 ; i++) {
            sayi+=i;

        }

        System.out.println(tm); //


        LocalTime tmLoopSonrasi=LocalTime.now();
        System.out.println(tmLoopSonrasi);//21:16:42.566706

        double nano1=tm.getNano();
        double nano2=tmLoopSonrasi.getNano();

        System.out.println("islem " + (nano2-nano1)  + "nanosaniyede bitti.");

        //

        System.out.println(tm.plusMinutes(1000));//14:01:23.909133




    }

}
