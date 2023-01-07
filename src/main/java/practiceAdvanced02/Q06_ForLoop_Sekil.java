package practiceAdvanced02;

public class Q06_ForLoop_Sekil {
    public static void main(String[] args) {
        //sekli cizdiren kodu yazdiriniz
        /*      A
                BB
                CCC
                DDDD
                EEEEE
                FFFFFF
         */
        char ch = 'A';
        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print((char)(ch+i)+" ");


            }
            System.out.println();

        }





    }
}
