package day28exceptions;

public class C03_Exceptions {

    //3)ArrayIndexOutOfBoundExceptions:


    //Bir string array'in verilen indexteki datayi donduren bir method olusturun.
    public static void main(String[] args) {
        String arr [] = {"Ali","Can","Tarik","Ayse"};
        getElementFromArray(arr,2);//positive Scenario//Tarik
        getElementFromArray(arr,0);//Ali
        getElementFromArray(arr,4);//ArrayIndexOutOfBoundException verdi


    }

    private static void getElementFromArray(String[] arr, int i) {
        try {
            System.out.println(arr[i]);
        } catch (Exception e) {
            System.out.println("Array'in indexinde olmayan data istendi==> "+e.getMessage());
            e.printStackTrace();
            System.err.println("Burasi renkli aciklama");//kirmizi yaziyo


        }


    }

}
