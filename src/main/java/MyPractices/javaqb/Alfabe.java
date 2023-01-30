package MyPractices.javaqb;

public class Alfabe {
    /* myClass isminde bir class oluşturunuz, class'ta size rastgele bir alfabetik karakter veren bir
  yöntem oluşturun ve ardından yöntemi kullanarak aşağıdakileri yazdırınız.
'A' ve 'a' için "İlk Karakter" yazdırınız.
'B' ve 'b' için "İkinci Karakter" yazdırınız.
'C' ve 'c' için "Üçüncü Karakter" yazdırınız.
'D' ve 'd' için "Dördüncü Karakter" yazdırınız.
  Diğerleri için "Diğer Karakterleri" yazdırınız.*/

    public static void main(String[] args) {
        String alphabet = Alfabe.getRandomAlphabet().toLowerCase();
        switch (alphabet) {
            case "a":
                System.out.println("Ilk Karakter");
                break;
            case "b":
                System.out.println("Ikinci Karakter");
                break;
            case "c":
                System.out.println("Ucuncu Karakter");
                break;
            case "d":
                System.out.println("Dorduncu Karakter");
                break;
            default:
                System.out.println("Diger Karakterler");

        }
    }
        public static String getRandomAlphabet(){
            String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
            int maxIndex = alphabet.length()-1;
            int randomIndex = (int)Math.round(Math.random()*maxIndex);
            return alphabet.substring(randomIndex, randomIndex+1);
        }

    }

