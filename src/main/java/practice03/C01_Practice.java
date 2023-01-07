package practice03;

import java.util.Arrays;

public class C01_Practice {
    public static void main(String[] args) {
        /*Her girdi satırı, tek bosluklarla ayrılmıs bir veya birkaç sözcük içerir. Sözcükler degismeden,
                her giris satırındaki sözcüklerin sırasını tersine çevirmek için kod yazınız.
        Çıktınızın satırlarında sonunda veya basında bosluk olmamalıdır.
                Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüsecektir.*/

        String str = "   Kemal Can Kuzu   ";
        String arr[] = str.split(" ");
        String tersstr = "";
        for (int i = arr.length-1; i >=0 ; i--) {
            tersstr+= arr[i]+" ";

        }
        System.out.print(tersstr);//trim basta ise yaradi mi? bastaki bosluklar gidiyor neden sondakiler gitmiyor
        //kelime kelime aldigi icin kuzu daki "k" harfindan once bosluk algilamiyor cunku.
        System.out.println("trim basta ise yaradi mi?");
        System.out.print(tersstr.trim());//trim sonda ise yaradi mi yaradi aslinda sondaki bosluklar duruyor
        System.out.print("trim sonda ise yaradi mi?");
    }
}
