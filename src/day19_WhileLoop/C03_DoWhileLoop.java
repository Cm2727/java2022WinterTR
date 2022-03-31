package day19_WhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        //kullanicidan pozitif bir tam sayi alip
        // while loop ile sayidan kucuk pozitif tam sayilari yazdiralim
        int input = 5;

        int sayi = 1;


        while (sayi <input) {
            System.out.println(sayi);

            sayi++;
        }

       //ayni soruyu doWhileLoop ile yapalim
        sayi=1;
        do{
            System.out.println(sayi);
            sayi++;
        }while(sayi < input);
        

        }
    }
//bu iki kodlamanin arasindaki fark 4 sayida 5 kontrol yaparken,
// do While loop 'ta 4 sayi yazdiracaksa 4 kontrol yapar
