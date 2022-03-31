package day17_forLoop;

public class C04_ForLoop {
    public static void main(String[] args) {
        //10 ile 30 arasindaki (10 ve 30 dahil)
        //sayilari aralarinda virgul olarak ayni satirda yazdirin
        //asagidaki ilk kod sadece 10 ile 29 arasindaki sayilari getirecekken
        for (int i = 10; i <= 29; i++) {
            System.out.print(i + " , ");
        }
        System.out.println(30);


//asagidaki kod dinamik bir koddur
        int baslangic = 10;
        int bitis = 30;
        //baslangic ve sonunu ben bilmiyorsam, kullanicidan aliyorsam

        for (int i = baslangic; i <= bitis; i++) {
            if (i < bitis) {
                System.out.print(i + " ,");
            } else System.out.print(i);
        }


    }
}
