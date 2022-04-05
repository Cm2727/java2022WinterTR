package day36_inheritance;

public class Muhasebe extends Personal {

    protected int saatUcreti;
    protected String statu;
    protected int maas;


    public int maashesaplama(){

        int maas=saatUcreti*8*30;
        return maas;



    }

}
