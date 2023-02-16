package practiceAdvanced03;

public class deneme {
    //tam dogru sayilmaz sadece bir ic arrayin indexi diger ic arryin indeksinden bir fazlaysa dogru calisir.
    public static void main(String[] args) {

        int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};

        int toplam=0;

        for (int i = 0; i < arr1.length; i++) {
            for(int j=0; j<arr1[i].length;j++){
            if ((arr1[i].length > arr2[i].length && j == arr1[i].length - 1) || (arr1[i].length < arr2[i].length && j == arr2[i].length - 1)) {
             continue;
                        }
             toplam+=arr1[i][j]+arr2[i][j];
                        }
                }
        System.out.println(toplam);
            }
        }

