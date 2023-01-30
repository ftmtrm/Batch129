package practiceAdvanced12;

public class Q03_ForLoop_UsAlma {
    //Bir sayının istenen kuvvetini hesaplayan bir method yazınız.
    public static void main(String[] args) {
        System.out.println("kuvvetiniAl() = " + kuvvetiniAl(5,2));
        //System.out.println(Math.pow(0,-5));

    }
public static double kuvvetiniAl(double taban, int us){
        double sonuc = 1;//us 0 ise zaten for loop calismicak ondan hep 1 vercek
    if(taban==0 && us ==0){
        throw new ArithmeticException("Taban ve us ayni anda 0 olamaz");
    }
        if(us>=0) {
            for (int i = 0; i < us; i++) {
                sonuc *= taban;
            }
            return sonuc;
        }else {
            for (int i = 0; i < Math.abs(us); i++) {
                sonuc *= taban;
            }
            return 1/sonuc;
        }
}

}
