package ebruMeryemFikriyeDilekSoruCozumu;

public class Soru_Continue {
    public static void main(String[] args) {
        int i=0;
        while(i<10){
            if(i==4 || i==7){//4 ve 7 haric olanlari yaz
                i++;//buraya tekrar bunu yazmasak, arttirma yapmaz,
                continue;//  eger i==4 olursa alttaki isleme devam etmeden dongunun basina gecer
           //i++ yazmasaydik I surekli 4 olarak klairdi. Konsola 4 e kadar olan kismi yazari
                //dongu hala devam ederdi ancak konsola tektrar tekrar yazmazdi
                //kirmizi butondan bunu anlayabiliriz
            }
            System.out.println("i : " + i);
            i++;
        }
    }
}
