package day04asciiwrapperclassoperatorsmemoryusage;

public class AsciiValues {
    //javada her karakterin sayisal bir degeri vardir.
    //bu degerler ASCII Degerler olarak adlandirilir tamaminin bulundugu tabloya ASCII Table denir.
    //herhangi bir karakterin ASCII degerini bulmak icin o karakteri int data type inde bir variable icine koyunuz.

    public static void main(String[] args) {
        char ch = 'A';
        System.out.println(ch);

        int unlem = '!';
        System.out.println(unlem);

        char c1 = 'K';
        char c2 = '?';
        System.out.println(c1+c2);//138
        //Javada char'lari matematiksel islemlerde kullanirsaniz java o charlarin ASCII degerlerini kullanir.

    }
}
