package day36_inheritance;

public class Memur extends  Muhasebe{

    public static void main(String[] args) {
        Memur memur1=new Memur();
        //Memur bir objesi Memur class'inin objesi olmasina ragmen
        //inherit ettigi Muhsabe ve onunda Pare


        //Personel class'indan
        memur1.persNo=1001;
        memur1.isim="Ahmet";
        memur1.soyisim="Tepecik";
        memur1.adres="Ankara";
        memur1.tel="3125756595";


        //Muhasebe class'indan
        memur1.saatUcreti=10;
        memur1.maas=memur1.maashesaplama();
        memur1.statu="Memur";

        System.out.println(memur1);


        Memur memur2=new Memur();

        memur2.persNo=1002;
        memur2.saatUcreti=10;
        memur2.statu="Memur";
        System.out.println(memur2);


    }


}


