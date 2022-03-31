package day24_List;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<Integer>();
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(0,7);
        sayilar.add(2,7);

        sayilar.remove(3);
        //sayilar.remove(5);//consolda index out of hatasi verir
        System.out.println(sayilar);

    }
}
