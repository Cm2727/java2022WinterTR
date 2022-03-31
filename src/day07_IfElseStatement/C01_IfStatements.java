package day07_IfElseStatement;

public class C01_IfStatements {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        if (a == b) {
            //if li cumlelerde parantez icinde boolean olmali.
            // ADi degil datasi, bunu da ==, && ve or ile yapilir
            System.out.println("verilen sayilar esittir");
            //esitlik olmadigi icin konsolda bir sey gorulmez
        }
        if (a < 100) {
            System.out.println("a 100'den buyuk");

        }
        if (a * b > 1) {
            System.out.println("sayilarin carpimi 5'ten buyuk");
            //if cumleleri kendinden baska kodlarla ilgilenmez
            //o sart ve osarta bagli sonuca odaklanir
            //birden fazla if cumlesi oldugunda hepsinin body calisabilecegi gibi
            //hicbinirinin body'si de calismayabilir
        }
    }
}

