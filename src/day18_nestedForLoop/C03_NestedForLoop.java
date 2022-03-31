package day18_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        //Kullanicidan pozitif bir rakam girmesini isteyin
        //girilen degeri su sekilde yazdirin
        //*
        //* *
        //* * *
        //* * * *
        //tek sira ve tek sutunsa nested for loop l-kullaniyoruz
        int input = 5;//5 sutun
        int input2=8;//8 satir
        for (int i = 1; i <= input; i++) {

            for (int j = 1; j <= input2; j++) {//burdaki input degil de i yazarsak
                //1. satirda 1, 2.satirda iki,3.satirda 3...olur
                //nested for loop ya kare ya da dikdortgen formatinda olabilir
                //veya ucgen formatinda olabilir
                //dikdortgen istedigimizde iki loop icin de
                //bagimsiz en point belirleriz
                //ucgen sekli vermek icin inner loop'un end pointi outer
                // degiskene bagli yapariz

                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
