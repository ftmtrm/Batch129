package day05typecastingstringmanipulations;

public class SwapValues {
    //Swap;yer degistirmek demektir.1.kapta patates 2.kapta domates var.
    // Swap yapilirsa 2.kapta patates 1.kapta domates olur.
    public static void main(String[] args) {

        int a = 12;
        int b = 5; //Swapten sonra a=5 ve b =12 olur.
        int temp = 0;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
      //1.yol:
        temp= a;//1.adim:
        a = b;//2.adim
        b = temp;//3.adim
        System.out.println("a:"+a);//5
        System.out.println("b:"+b);//12

        // 2.yol:
        //a= 12, b=5    a=a+b a=17 oldu b=a-b  b=12 oldu
        // a=a-b  a= 17-12  a=5 oldu

        int x = 12;
        int y = 5;
        System.out.println("x:"+x);
        System.out.println("y:"+y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("x:"+x);
        System.out.println("y:"+y);

    }

}
