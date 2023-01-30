package ssgler.arraylist;
import java.util.ArrayList;
import java.util.List;
public class ArrayList02 {
    /*
    elimizde urunlerin bulundugu bir liste var
    urun listesindeki istenen siradaki urunu istegimiz
    yeni urunle degistirip eski urunu
    var olan eski urunler listesine ekleyelim
    */
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        List<String> eskiUrunler = new ArrayList<>();

        urunler.add("cikolata");
        urunler.add("cay");
        urunler.add("cerez");
        urunler.add("meyve");
        String silicenekUrun="cay";
        int temp=urunler.indexOf(silicenekUrun);
        System.out.println(urunler);
        urunler.remove(silicenekUrun);
        System.out.println(urunler);
        urunler.add(temp,"kahve");
        System.out.println(urunler);
        urunler.set(temp,"meyve suyu");
        System.out.println(urunler);
        eskiUrunler.add(silicenekUrun);
        System.out.println(eskiUrunler);

    }

}

