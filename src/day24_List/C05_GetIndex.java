package day24_List;

import java.util.ArrayList;
import java.util.List;

public class C05_GetIndex {
    public static void main(String[] args) {
        List<Integer> sayilarList = new ArrayList<Integer>();
        sayilarList.add(1);
        sayilarList.add(3);
        sayilarList.add(43);
        sayilarList.add(15);

        System.out.println(sayilarList.get(3));//15
        System.out.println(sayilarList);//liste degismez,sadece bilgi getirir


        
    }
}
