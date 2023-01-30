package MyPractices.javaqb;

public class TekrarliKarakterlerString {
    //Bir string'te tekrarlanan karakterleri yazdiran kodu yaziniz.

    public static void main(String[] args) {
       // 1. Yol:
        String s = "accessories";
        String d = "";
        for(Integer i=0; i<s.length(); i++){
            String c = s.substring(i,i+1);
            if(s.indexOf(c)!=s.lastIndexOf(c)){
                if(!d.contains(c)){
                    d = d + c;
                }
            }
        }
        System.out.println(d);
        //2. Yol:

        Integer i=0;
        while(i<s.length()){
            String c = s.substring(i,i+1);
            if(s.indexOf(c)!=s.lastIndexOf(c)){
                if(!d.contains(c)){
                    d = d + c;
                }
            }
            i++;
        }
        System.out.println(d);
        //3. Yol:
        do{
            String c = s.substring(i,i+1);
            if(s.indexOf(c)!=s.lastIndexOf(c)){
                if(!d.contains(c)){
                    d = d + c;
                }
            }
            i++;
        }while(i<s.length());
        System.out.println(d);

        /*String s = "accessories";
        String arr[] = s.split("");

        int counter = 0;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].equals(arr[i - 1])) {
                counter++;
            }

            }
            int idx = 0;
            String brr[] = new String[counter];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].equals(arr[i - 1])) {
                brr[idx++] = arr[i - 1];

            }

        }
        System.out.println(Arrays.toString(brr));*/
    }
}

















