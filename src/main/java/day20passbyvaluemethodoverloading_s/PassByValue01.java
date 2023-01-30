package day20passbyvaluemethodoverloading_s;

public class PassByValue01 {
    public static void main(String[] args) {

        /* 1. Java passbyvalue sayesinde variable'larin orjinal degerlerini koruma altina alir.
           passbyreferance orjinal degeri koruma altina almaz.
           methodlar sadece kopyalarin degerini degistirir,orjinali degil.
           2.
         */
        double shirt = 100;
        double studentShirtPrice = discount("student",shirt);
        double veteranShirtPrice = discount("veteran",shirt);
        double seniorShirtPrice = discount("senior",shirt);

        shirt = discount("veteran",shirt);
        //gaziler icin yapilan indirimi herkese uygulayalim denilirse o zaman orjinal deger 80'e dusmus olur.
        System.out.println("shirt = " + shirt);//80 olur

        //discount("student",shirt);

        System.out.println("shirt = " + shirt);//100
        System.out.println("studentShirtPrice = " + studentShirtPrice);//90
        System.out.println("veteranShirtPrice = " + veteranShirtPrice);//80
        System.out.println("seniorShirtPrice = " + seniorShirtPrice);//95

    }
    public static double discount (String state, double price){
        switch(state){
            case "student":
                price = price*0.90;
                break;
            case "veteran":
                price = price*0.80;
                break;
            case "senior":
                price = price*0.95;
                break;
            default :
                price=price;
        }
        return price;//more actionsdan public int'i public double'a cevirdi.

    }
}
