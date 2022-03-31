package ebruMeryemFikriyeDilekSoruCozumu;

public class Soru26 {
    public static void main(String[] args) {
        //Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim
        String gunAdi="sali";
        switch (gunAdi) {
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("hafta ici");break;
            case "cumartesi":
            case "pazar":
                System.out.println("hafta sonu");break;
            default:
                System.out.println("hatali giris");


        }
    }
}
