package ebruMeryemFikriyeDilekSoruCozumu;

import java.util.Scanner;
/*
Bakıye (başlangıç bakıyesi 1000 tl) öğrenme,
para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
 */

public class Soru_Atm {
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int bakiye=1000;
int islem;
        System.out.println("Bakiye goruntuleme : 1 \n Para yatirma : 2\nPara cekme: 3 \n Sistemden cikis : 4\nYapacaginiz islemi seciniz.");
  islem=scan.nextInt();

  switch(islem){
      case 1:
          System.out.println("bakiyeniz : "+ bakiye);break;
      case 2:
          System.out.println("meblag girin :");
          int yatirilanMeblag=scan.nextInt();
          bakiye+=yatirilanMeblag;
          System.out.println("bakiyeniz : "+bakiye);break;

      case 3:
          System.out.println("cekeceginiz miktari giriniz");
          int cekilecekMeblag=scan.nextInt();
          if(cekilecekMeblag>bakiye){
              System.out.println("hesabinizda o kadar para yok.Tekrar giriniz ");
              int cekilecekMeblag2=scan.nextInt();
              for (int i=0; i>cekilecekMeblag; i++) {
                  System.out.println("tekrar deneyin");


              }

          }else{
              bakiye-=cekilecekMeblag;
              System.out.println("bakiyeniz : "+bakiye);
          }
          break;

      case 4:
          System.out.println("sistemden cikis");
      default:
          System.out.println("gecersiz islem");
  }




    }
}
//"Bakiye goruntuleme : 1 \n Para yatirma : 2\nPara cekme: 3 \n Sistemden cikis : 4\nYapacaginiz islemi seciniz."