package day20passbyvaluemethodoverloading_s;

public class PassByValue02 {
    public static void main(String[] args) {
        String name = "Tom Hanks";
        //updateName(name,"Jr.");
        String updateName = updateName(name,"Jr.");
        System.out.println("name = " + name);//Tom Hanks
        System.out.println("updateName = " + updateName);//Tom Hanks Jr.

    }
    public static String updateName(String name, String add){//bu method kopyayi degistirdi
        name=name+" "+add;
        return name;
    }
}
