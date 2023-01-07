package practice.datatypesscannerdaytime02;

public class C02_MethodCreation {
    //dikdortgenin alanini hesaplayan methodu olusturunuz ve kullaniniz.
    public static void main(String[] args) {


        System.out.println(areaOfRectangle(8,7));

    }

    public static int areaOfRectangle(int a, int b) {
        return a * b;//main method static oldugu icin main icindeki herseyin static olmasi gerekir
        //method adi camel case kuralina gore olusturulur.
    }

    }

