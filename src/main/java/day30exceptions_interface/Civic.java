package day30exceptions_interface;

/*  1)bir interface'i bir class'in parent'i yapmak icin "implement" keyword'unu kullaniriz.
    2)java parent'lar class oldugunda multiple parnet'a musaade etmez.
    Ama biz bazen multiple parent'a ihtiyac duyariz. Bu ihtiyaci gidermek icin Java Interface ismini
    verdigi yeni bir yapi olusturmustur.Bu yapi sayesinde bir class icin coklu "interface parent" olusturabiliriz
    3)Interface'ler concrete method iceremezler.Dolayisiyla interface'in icindeki hicbirsey istege bagli degildir.
     hersey child classlar icin mecburidir.Bu yuzden interface'lere "todolist" de denir

 */
public class Civic implements AC,Engine,Security {

    @Override
    public void cool() {
        System.out.println("Civic cools perfectly");
    }


    @Override
    public void run() {
        System.out.println("AC runs perfectly");
    }
}
