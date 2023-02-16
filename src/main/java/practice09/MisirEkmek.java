package practice09;

public abstract class MisirEkmek extends TSE{

        public static void main(String[] args) {
            DiyetEkmek diyet = new DiyetEkmek();
            diyet.gramaj500();
            diyet.hijyenikOlma();
            diyet.odunAtesindePiser();
            diyet.undanYapilir();
        }
    @Override
    void gramaj500() {//babasi abstract ise sorumlulugu baba yapsa
        //olur.ya da birini baba digerini cocuk da yapabilir.ama abstract degilse hem baba hem cocuk 2sini de
        //yapmak zorundadir.ikisini (hijyenik olma ve gramaj500) de babasi yerine bu class yaparsa sikayet etmez.
        // yoksa ikisini de yapmasi gerekir.ya da birini babasi birini kendisi yapsa yeter.
        //babasi yapmasa ikisini de kendisi yapmak zorunda !!!
    }
    @Override
    void hijyenikOlma() {

    }
}


