package MyPractices.javaqb;

public class AX_Matrix {

        /*Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        A A A A A A A A
        A X X X X X X A
        A X X X X X X A
        A X X X X X X A*/

        public static void main(String[] args) {
        int rows = 4, columns = 8;
        for(int i=1; i<=rows; i++){
            String s = "";
            if(i==1 || i==rows){
                for(Integer k=1; k<=columns; k++){
                    s += "A ";
                }
                System.out.println(s);
            }else{
                s += "A ";
                for(Integer m=2; m<columns; m++){
                    s += "X ";
                }
                s += "A ";
                System.out.println(s);
            }
        }

    }
}
