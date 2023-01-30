package day25inheritance;

public class A04_Lessons {

    public void liveSessions(){
        System.out.println("Online dersler");
    }

    /*7*/ public A04_Lessons() {
        /*8*/  System.out.println("Salih bey icin calisti");
        //default bos cons.silindi cunku asagida parametreli olusturduk
        //o nedenle tekrar bos cons.olusturduk
        /*9*/    }

    /*5*/public A04_Lessons(String level){//parametreli cons.
         /*6*/   this();
        /*10*/  System.out.println("Derslerin seviyesi olur");

    }




}
