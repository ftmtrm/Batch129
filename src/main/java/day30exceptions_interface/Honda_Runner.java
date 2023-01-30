package day30exceptions_interface;

public class Honda_Runner {
    public static void main(String[] args) {
            Civic myCivic = new Civic();
            myCivic.cool();

        System.out.println(AC.price);//2000 final oldugu icin degismez.final variable'lar intelliJ'de
        //boyle gorunur

        System.out.println(Engine.price);//3000

        System.out.println(Security.price);//4000

        System.out.println(AC.model);

        Accord myAccord = new Accord();
            myAccord.cool();
    }
}
