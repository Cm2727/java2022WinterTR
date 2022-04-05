package day36_inheritance;

public class SurekliIsciler extends Isci {

    public static void main(String[] args) {

        SurekliIsciler surIsci1=new SurekliIsciler();
        surIsci1.persNo=5001;
        surIsci1.isim="Cem";
        surIsci1.soyisim="Akay";
        surIsci1.statu="Isci";
        surIsci1.saatUcreti=11;
        surIsci1.maas=surIsci1.maashesaplama();

        System.out.println(surIsci1);
    }

    @Override
    public String toString() {
        return "SurekliIsciler{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
