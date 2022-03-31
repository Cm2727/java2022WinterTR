package day12_stringManipulations;

public class C03_Contains {
    public static void main(String[] args) {
        //kullanicidan email adresi isteyin
        //@gmail icermiyorsa 'lutfen gmail adresi girin' yazin
        //@gmail. com ile bitiyorsa "email adresi kaydedildi "yazin
        //@gmail.com ile bitmiyorsa "lutfen yazimi kontrol edin " yazdirin

        String email = "haberci@hotmail.com";
        String arananMetin = "@gmail.com";

        if (!email.contains(arananMetin)) {////basina ! koymak  if in durumunun  tam tersini araycak
            System.out.println("lutfen gmail adresi girin");
            //boolean ifadeyi tersine cevirmek istiyorsak basina ! koyariz

        } else if (email.lastIndexOf(arananMetin) == (email.length() - 10)) {
            System.out.println("email adresi kaydedildi");

        } else {
            System.out.println("lutfen yazimi kontrol edin");
        }

    }
}
////contains true ya da false olarak doner,
//        // char icermez
