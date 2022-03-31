package day12_stringManipulations;

public class C04_EndsWith {
    public static void main(String[] args) {
        //kullanicidan email adresi isteyin
        //@gmail icermiyorsa 'lutfen gmail adresi girin' yazin
        //@gmail. com ile bitiyorsa "email adresi kaydedildi "yazin
        //@gmail.com ile bitmiyorsa "lutfen yazimi kontrol edin " yazdirin

        String email = "haberci@hotmail.com";
        String arananMetin = "@gmail.com";

        if (!email.contains(arananMetin)) {
            System.out.println("lutfen gmail adresi girin");
        } else if (email.endsWith(arananMetin)) {
            System.out.println("email adresi kaydedildi");
        } else {
            System.out.println("lutfen yazimi kontrol edin");
        }
    }
}
//verilen stringin istenen karakter ile bitip bitmedigine bakar
//true ya da false olarak doner
//parametre string olmalidi

