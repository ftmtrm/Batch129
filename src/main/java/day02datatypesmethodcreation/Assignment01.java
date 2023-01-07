package day02datatypesmethodcreation;

public class Assignment01 {
    public static void main(String[] args) {
        int dikdortgeninAlani = areaOfRectangle(8, 7);
        System.out.println(dikdortgeninAlani);

        int dikdortgeninCevresi = perOfRectangle(7,9);
        System.out.println(dikdortgeninCevresi);

        double daireninAlani = areaOfCircle(3.14, 5);
        System.out.println(daireninAlani);


    }
        private static int areaOfRectangle (int a, int b) {
        return a*b ;
        }

        public static int perOfRectangle (int a, int b) {

        return 2*a+2*b;
        }

        public static double areaOfCircle (double p, double r) {

        return p*r*r;
        }
    }



