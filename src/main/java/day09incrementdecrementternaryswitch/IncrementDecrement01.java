package day09incrementdecrementternaryswitch;

public class IncrementDecrement01 {
    public static void main(String[] args) {
        int a= 5;
        System.out.println(a);

        //Increment1
        a= a+2;// veya a += 2;
        System.out.println(a);//7
        //ex1: bir tane integer variable olusturun ve onu iki sekilde 5 artirin

        int b =9;
        b=b+5;
        System.out.println(b);//14
        b+=5;
        System.out.println(b);//19
        //Increment2
        int d =6;
        d=d*2;
        System.out.println(d);
        d*=2;
        System.out.println(d);

        //Decrement
        int c = 8;
        c=c-3;
        System.out.println(c);
        c-=3;
        System.out.println(c);
        //Decrement2
        int e =9;
        e=e/3;
        System.out.println(e);
        e/=3;
        System.out.println(e);
        //"1" ile increment ve decrement
        int f = 12;
        //f=f+1 veya f+=1 olabilir ancak kullanilmaz!!!!
        f++;
        System.out.println(f);
        int h = 10;
        h--;
        System.out.println(h);
        //"post increment" ve "preincrement"
        int i =10;
        int k= i++;//postincrement "+" variable'dan (i'den) sonra gelmis
        System.out.println(k);//10 olur cunku Java direk i'yi alir k'nin icine koyar
        System.out.println(i);//11 olur
        int m= 15;
        int n= ++m;//preincrement "+" variable'dan (m'den) once gelmis
        System.out.println(m);//16 olur. "m" satir sonunda artirildigi icin m'nin degeri 16 oldu
        System.out.println(n);//16 olur.m'yi artirip n'nin icine koydu.
        //"post decrement" ve "predecrement"
        int p = 17;
        int r = p--;// p 16 r 17 olur
        System.out.println(p);
        System.out.println(r);

        int s = 20;
        int t = --s;
        System.out.println(s);
        System.out.println(t);


    }
}
