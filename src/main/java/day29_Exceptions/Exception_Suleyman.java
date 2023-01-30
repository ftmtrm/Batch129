package day29_Exceptions;

public class Exception_Suleyman {
    public static void main(String[] args) {
        //10) ClassCastException:
        // Birbirine donusturulemeyecek data type'larini donusturmekte
        // israr ederseniz Java ClassCastException atar

        Object obj = 70;
        String str = "";

        try {
            str = (String) obj;
            System.out.println(str);
        }catch(ClassCastException e){
            System.out.println("Her data type'i her data type'ine cevrilmez");
        }

    }

}

