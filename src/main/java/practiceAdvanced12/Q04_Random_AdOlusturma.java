package practiceAdvanced12;

public class Q04_Random_AdOlusturma {

    public static void main(String[] args) {
//Rastgele alınan harfleri bir Stringe ekleyerek adınızı oluşturan ve
// bunu kaç deneme ile yaptığını yazdıran bir kod yazınız.
        String alphabet = "abcçdefgğhıijklmnoöprsştuüvyzABCÇDEFGĞHIJKLMNOÖPQRSŞTUÜVWXYZ ";
        String isim = "Ali Can";
        String yeniIsim = "";
        int sayac = 0;
        for (int i = 0; i < isim.length(); i++) {
            while (true) {
                char rastgeleHarf = alphabet.charAt((int) (Math.random() * alphabet.length()));
                sayac++;
                if (isim.charAt(i) == rastgeleHarf) {
                    yeniIsim += rastgeleHarf;
                    break;
                }
            }
        }
            System.out.println(yeniIsim);
            System.out.println(sayac);

            String name = "ilker";
            int idx = 0;
            int counter = 0;
            String result = "";
            while (true) {
                counter++;
                int random = (int) (Math.random()*alphabet.length());
                char randomChar = alphabet.charAt(random);
                if (randomChar == name.charAt(idx)) {
                    result += randomChar;
                    idx++;
                    System.out.println(randomChar+": "+counter+". denemede bulundu.");
                }
                if (name.equals(result)) {
                    break;
                }
            }
            System.out.println("counter = " + counter);
        }

        }
