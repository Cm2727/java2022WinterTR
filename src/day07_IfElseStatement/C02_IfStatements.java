package day07_IfElseStatement;

public class C02_IfStatements {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if (a < b && b < 100) {//bu ilk sart dogruysa body deki tum kodlar calisir, yalnissa hic biri calismaz
            System.out.println("isteginiz gereklesecektir");
            System.out.println("body icindeki tum kodlar calisir");
        }
        if (a < b) System.out.println("suslu parantez olmazsa sadece bir satir calisir");
        //her if kendi ilk noktali virgule kadar calisir
        System.out.println("2.satir da calisti");

        //if statement te boolean ister. || , + vs ile calismaz yani ve de kabul etmz
        //bir if cumlesinin daha nalayisli olmasini istiyorsaniz, if body'sini suslu parantez icine yazmalisiniz

    }
}

//bir if cumlesinin daha nalayisli olmasini istiyorsaniz, if body'sini suslu parantez icine yazmalisiniz

//
