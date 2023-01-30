package ssgler.multidimensional;

public class MDArrays02 {
    public static void main(String[] args) {
    /*
    soru 7) Verilen bir multi dimensional array'in inner indexindeki
    elementlerinin ortalamasından büyük elementleri yazdıran bir kod yazınız.
    */

        int arr[][]={{6,5,8},{12,15,13},{17,20,21}};

        int sum=0;
        int ort=0;

        for (int i = 0; i < arr.length; i++) {
            sum=0;

            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
                ort=sum/ arr[i].length;

            }
            for (int j = 0; j < arr[i].length; j++) {
                if (ort<arr[i][j]){
                    System.out.print(arr[i][j]+" ");

                }

            }
        }

    }
}

