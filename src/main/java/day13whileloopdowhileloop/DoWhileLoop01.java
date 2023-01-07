package day13whileloopdowhileloop;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        //1)while loop
        int i= 1;
        while(i<1){       //1)while body hic calismadi 2)while loop da zero execution mumkundur
            //3)once dusunur sonra hareket eder
            System.out.println("Sen bir while loopsun...");
            i++;

        }
        //2)do-while loop//banka hesabina username password girmek gibi
        int k = 1;
        do {   //1)do-while body calisti
            // 2) do-while kullandiginizda loop body en az bir kere calisir
            // do-while'da zero execution mumkun degildir.
            // 3)once hareket eder sonra dusunur
            System.out.println("sen bir do-while loopsun....");
            k++;
        }while(k<1);

    }
}
