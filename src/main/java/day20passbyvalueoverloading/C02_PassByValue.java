package day20passbyvalueoverloading;

public class C02_PassByValue {
    public static void main(String[] args) {
        /*      Gomlek            = 100 TL
                Ogrenci           = -10 TL indirim =90 TL
                Gazi              = -20 TL indirim =80 TL
                Yaslilara         = -5  tL indirim =95 TL*/

         int gomlek = 100;
         indirim("ogrenci",gomlek);
        System.out.println(indirim("ogrenci",gomlek));
         indirim("gazi",gomlek);
        System.out.println(indirim("gazi",gomlek));
         indirim("yaslilar",gomlek);
        System.out.println(indirim("yaslilar",gomlek));

        String kutlama = "Woow";
        System.out.println("kutlama = " + kutlama);
       kutlamaUnlemIle(kutlama);
        System.out.println("unlem eklendikten sonra kutlama = " + kutlama);
        kutlama=kutlamaUnlemIle(kutlama);
        System.out.println("methodan sonra atama yapilinca main icinde kutlama = " + kutlama);//woow

    }

    private static String kutlamaUnlemIle(String kutlama) {
        String unlemliKutlama=kutlama+"!";
        System.out.println("method icinde kutlama = " + unlemliKutlama);
        return unlemliKutlama;
    }

    private static int indirim(String durum, int gomlek) {
        switch (durum){
            case "ogrenci":
                gomlek = gomlek-10;
                break;
            case "gazi":
                gomlek = gomlek-20;
                break;
            case "yaslilar":
                gomlek = gomlek-5;
                break;
            default:
                gomlek=gomlek;
        }

return gomlek;


    }
}
