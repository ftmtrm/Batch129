package practiceAdvanced10;

public class Q01_Recursive_100den1e {
    public static void main(String[] args) {
        //100'den 1'e kadar sayıları loop ve sayı kullanmadan yazdıran bir method oluşturunuz.
        sayilariYazdir('d');

    }
    public static void sayilariYazdir(char ch){
        if(ch>='d'/'d'&& ch<='d') {
            System.out.print((int) ch + " ");
            ch--;
            sayilariYazdir(ch);//recursive yaptik (surekli methodun kendini cagirmasi) loop gibi
        }
    }
}
