package practice09;

public class BagetEkmek extends TSE{
        static int fiyat=30;

        public static void main(String[] args) {
            BagetEkmek baget = new BagetEkmek();
            System.out.println(baget.malzeme);
            baget.odunAtesindePiser();//kullanmak zorunda degiliz abstract method olduklari icin
            baget.hijyenikOlma();
        }
        @Override
        void gramaj500() {
        }
        @Override
        void hijyenikOlma() {

        }
    }

