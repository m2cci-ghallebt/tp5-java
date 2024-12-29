
public class App {

    public static void main(String[] args) throws Exception {
        EnsembleDeLettres l1 = new EnsembleDeLettres("ffaaaaff");
        EnsembleDeLettres l2 = new EnsembleDeLettres();
        l1.afficher();
        l2.afficher();
        System.out.println(l1.estVide());
        System.out.println(l2.estVide());
        System.out.println(l1.getCardinal());
        System.out.println(l2.getCardinal());
    }
}
