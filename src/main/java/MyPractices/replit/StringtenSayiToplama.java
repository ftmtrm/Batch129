package MyPractices.replit;

public class StringtenSayiToplama {
    /*Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.
input : ade1r4d3 output : 8    Use Character.isDigit()              Integer.valueOf()*/

    public static void main(String[] args) {
        String str = "ade1r4d3";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Character.getNumericValue(str.charAt(i));
            }

        } System.out.println(sum);

        System.out.println();

        /*Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array
        Input : {3,2,5,4,1,6}*/
        int arr []= {3,2,5,4,1,6};
         int min = arr[0];
         int max = arr[0];

         for(int w:arr){
//             if(w>max) {
//                 max=w;
                 max = Math.max(max,w);
                 min = Math.min(min,w);
             }
//                 if(w<min){
//                     min=w;

        System.out.println(min);
        System.out.println(max);
         }

    }








