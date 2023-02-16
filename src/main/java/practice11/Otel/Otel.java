package practice11.Otel;

public abstract class Otel {//child'lari bazi methodlari kullanmaya zorlamak icin
    public static void main(String[] args) {

    }//main
    public abstract void kahvalti();

    public int wifi(int kisiSayisi){ //concrete method body'li isteyen kullanir

        return kisiSayisi*3;
    }
}

