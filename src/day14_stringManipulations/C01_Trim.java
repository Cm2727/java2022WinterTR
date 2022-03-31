package day14_stringManipulations;

public class C01_Trim {
    public static void main(String[] args) {
        //trim bastaki ve sondaki tum bosluklari siler
        String str = "  Siz ne dersiniz.  ";
        str.trim();//burda bosluksuz yazmaz, cunku atama yapilmamis
        System.out.println(str);
        System.out.println(str.length());
        str = str.trim();//burda atama yapildigi icin bosluksuz yazar
        System.out.println(str);
        System.out.println(str.length());
    }
}
