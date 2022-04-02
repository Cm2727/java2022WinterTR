package day33;

public class C06_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Prize dikkat");
        System.out.println(sb1.insert(12,"edin"));
        String str="Hayatta cok guzel seyler var";
        System.out.println(sb1.insert(0,str,0,8));//Hayatta Prize dikkat edin.

        System.out.println(sb1.reverse());//nidetakkid ezirP attayaH
        System.out.println(sb1.reverse());//Hayatta Prize dikkatedin




    }
}
