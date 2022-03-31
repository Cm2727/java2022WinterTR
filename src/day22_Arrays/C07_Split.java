package day22_Arrays;

import java.util.Arrays;

public class C07_Split {
    public static void main(String[] args) {
        String str="Java gun gectikce guzellesir";

        //kelimere bolmek istirsak
        String kelimeler[]=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));

        String gectikce[]=str.split("gectikce");
        System.out.println(Arrays.toString(gectikce));//java gun, guzellesir

        String harfler[]=str.split("");
        System.out.println(Arrays.toString(harfler));//aralarina virgul koyarak yazar,
                                                    //aralardaki bosluklari da karakter sayar ve iki virgul arasina alir



    }
}
