package day12loops;

public class C04_WhileLoop {
    public static void main(String[] args) {
        //3'den 10'a kadar olan tamsayilari ayni satira yanyana yazdiran kodu yaziniz.
        //1.yol:
        for (int i = 3; i <11 ; i++) {
            System.out.print(i + " ");

        }System.out.println();
            //2.yol
            int i = 3;//baslangic degeri
             while(i<11){//bitis degeri
                 System.out.print(i+" ");
                 i++;//increment,decrement while loop'un body'si icinde yazilir
        }
        System.out.println();
             //Ex2: 17'den 4'e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz.
        int j =17;
             while (j>3){
                 if(j%2==0){
                     System.out.print(j+" ");
                 }
                 j--;//if body'nin disinda while loop'un icinde yazilmali
             }

    }
}
