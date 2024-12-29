
public class EnsembleDeLettres {

    public boolean[] present;

    public EnsembleDeLettres() {

        this.present = new boolean[26];
        for (int i = 0; i < 26; i++) {
            present[i] = false;
        }
    }

    public void EnsembleDeLettresHasard(int nbr) {

    }

    public EnsembleDeLettres(String str) {
        this();
        for (int i = 0; i < str.toCharArray().length; i++) {
            present[str.toCharArray()[i] - 'a'] = true;
        }
    }

    public void afficher() {
        System.out.print("------->  ");
        System.out.print("{");

        boolean first = true;

        for (int i = 0; i < this.present.length; i++) {
            if (this.present[i]) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print((char) (i + 'a'));
                first = false;
            }
        }

        System.out.println("}");
    }

    public int getCardinal() {
        int card = 0;
        for (int i = 0; i < this.present.length; i++) {
            if (present[i]) {
                card++;
            }
        }
        return card;
    }

    public boolean estVide() {

        for (int i = 0; i < this.present.length; i++) {
            if (present[i]) {
                return false;
            }
        }
        return true;
    }
}
