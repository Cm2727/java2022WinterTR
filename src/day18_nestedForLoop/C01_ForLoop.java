package day18_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        //kullanicidan 10'dan kucuk bir tam sayi isteyin ve
        //girilen sayinin faktoriyelini bulun(5!=5*4*3*2*1)

        int input = 7;
        int faktoryel = 1;
        String faktoryelAcikYazim = "";

        for (int i = input; i >= 1; i--) {
            faktoryel *= i;
            if (i == input) {
                faktoryelAcikYazim = faktoryelAcikYazim + i;
            } else
                faktoryelAcikYazim = faktoryelAcikYazim + "*" + i;
        }//sout loop un disina yazilir

        System.out.println(input + "! = " + faktoryelAcikYazim);
    }
}
