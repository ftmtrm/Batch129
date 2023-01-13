package ssgler.ssg_scope;

public class Scope01 {
    /*There 3 types of variable
  1) instance variable
  2)local variable
  3)static Variable

    instance variable ve  local variable arasindaki fark ne dir ?

            1)  instance variable class icinde tanimlir  local variable ise method icinde tanimlanir.
            2) instance variable ilk degieri koymazsaniz olur hata vermez sonra koyabilir siniz ama Local varibale
    ilk degri atmaniz lazim.*/

    public static String okulIsmi = "Yildiz koleji";//static variable
    String stdName = "Erel";//instance variable
    public static void main(String[] args) {
        print();
        Scope01 scope01 = new Scope01();
        System.out.println("scope01.stdName = " + scope01.stdName);
    }
    public static void print (){
        int x =12;//local variable
        System.out.println(x);
        System.out.println(okulIsmi);//static oldugu icin heryerden gorulur
    }
}
