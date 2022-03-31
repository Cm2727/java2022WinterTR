package ebruMeryemFikriyeDilekSoruCozumu;

public class Soru25 {
    public static void main(String[] args) {
        //Kullanicidan SDET kisaltmasindaki harflerden birini
        // yazmasini isteyin. Kullanici S girerse “Software”
        //D girerse “Developer”
        //E girerse “Engineer”
        //T girerse “In Testing” yazdirin

        char harf='D';
        switch (harf){
            case 'S':
                System.out.println("Software");break;
            case 'D':
                System.out.println("Developer");break;
            case 'E':
                System.out.println("Engineer");break;
            case 'T':
                System.out.println("In Testing");break;
                default:
                    System.out.println("hatali giris");

        }
    }
}
