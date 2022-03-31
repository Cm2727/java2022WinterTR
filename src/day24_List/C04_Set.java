package day24_List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_Set {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("meryem");
        list.add("aliye");
        list.add("neva");
        list.add("tarik");
        System.out.println(list);
        list.set(1,"anne");
        System.out.println(list);//aliye'yi anne ile degistirir
        //daha onceden listeden var olanlari da arsiv gibi tutmak istiyorsak

        List<String> logList = new ArrayList<String>();


        list.add(list.set(1,"kuzularim"));
        //list ' git, 1 i kuzularim diye degistir,degistirilmis olani da kaydet
        System.out.println(list);
        System.out.println(logList);

    }
}
