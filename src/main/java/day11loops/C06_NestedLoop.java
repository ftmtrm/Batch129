package day11loops;

public class C06_NestedLoop {
    /* Asagidaki ciktiyi verecek kodu yaziniz

  Week: 1
       Day: 1
       Day: 2
       Day: 3
  ........
  Week: 2
       Day: 1
       Day: 2
       Day: 3
   .......
  Week: 3
       Day: 1
       Day: 2
       Day: 3
 .......
        */

    public static void main(String[] args) {
        for (int i = 1; i<4 ; i++) {
            System.out.println("Week: "+i);
            for (int j = 1; j<4 ; j++) {
                System.out.println("    Day: "+j);
                if (j==3){//kullanilmasa da olur
                    System.out.println(".......");

            }

        }

        }
    }


}
