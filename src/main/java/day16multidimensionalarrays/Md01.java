package day16multidimensionalarrays;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        //Note1: Array'lere non-primitive data konulamaz.
        // Arraylere primitive data veya reference konulur.
        // Ama siz bir arrayi yazdirmak istediginizde Java adresler yardimiyla non-primitive dataya ulasir ve
        // o non-primitive datayi sanki arrayin icindeymis gibi gosterir.
        //Note2: MD arraylerde elemanlara birer birer ulasmak icin nested loop kullanilmasi gerekir.

        int a[][] = {{2, 5, 1}, {32, 75}};
        int totalElement = 0;
        for (int[] s: a) {
            totalElement+=s.length;

        }

        //"b" isimli tek boyutlu bir array olusturunuz

            int b[] = new int[totalElement];
        System.out.println(Arrays.toString(b));


            //"a" arrayindeki elemanlari "b" arrayine transfer ediniz.

            int idx = 0;
            for (int[] w  : a) {
                for (int k : w) {
                    b[idx] = k;
                    idx++;
                }
            }
            System.out.println(Arrays.toString(b));
            }
        }


