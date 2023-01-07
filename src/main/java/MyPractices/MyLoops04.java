package MyPractices;

public class MyLoops04 {
    public static void main(String[] args) {
        for (int i = 1; i <10 ; i= i+1) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
            System.out.println();

        int num=3;
        while(num<10){
            System.out.print(num+" ");
            num=num+3;
        }
        System.out.println();

      int sayi = 1;
      while(sayi<10){
          if(sayi%3==0){
              System.out.print(sayi+" ");
          }
          sayi=sayi+1;

      }

    }
}
