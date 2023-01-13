package ssgler.ssg_scope;

public class Scope02 {
    int x1 = 15;
    int z;
    public static void main(String[] args) {
        int x = 12;//local variable
        String name = "ali";
        System.out.println(name);
        {
            int z1 = 15;
            System.out.println(x);//block scope {  }
            System.out.println(z1);
        }
        //z1 burda yazdirilmiyor scope disinda cunku
        name = "frotan";
        System.out.println(name);

        }

    void show () {
        int z = 15;//local variable
    }
}