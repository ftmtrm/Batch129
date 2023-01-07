package day19listvarargs;

public class C06_Varargs {
    public static void main(String[] args) {


        /*Farkli sayida datalar ile calisabilmek icin varargslar olusturulmustur.
        farkli parametreler ile calisabilen methodlar olusturmak icin vararrgslar kullanilir.
        varargs'larin arka tarafinda Array'ler calisir.
        Varargs'lar nasil olusturulur (Data type...varargs ismi) veya (Data type...varargs ismi)
        Varargs en sonda olmak sartiyla bir method olustururken farkli data tipleri kullanilabilir.*****INTERVIEW)
        Bir method icerisinde birden fazla varargs kullanilabilir mi? Hayir Kullanilmaz hata verir.*****INTERVIEW
        UNREACHABLE KOD olur. ulasilamaz kod olur.
         */

        ikiSayiyiTopla(2, 3);
        ucSayiyiTopla(6, 8, 14);
        dortSayiyiTopla(56, 96, 40, 30);
    }

    private static int dortSayiyiTopla(int i, int i1, int i2, int i3) {
        return i + i1 + i2 + i3;
    }

    private static int ucSayiyiTopla(int i, int i1, int i2) {
        return i + i1 + i2;
    }

    private static int ikiSayiyiTopla(int i, int i1) {

        return i + i1;
    }

    private static int add(int... a) {
        int sum = 0;
        for (int w : a) {
            sum = sum + w;

        }
        return sum;
    }


}


