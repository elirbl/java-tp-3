package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Commande c1 = new Commande(25.0, 10.0, new LivraisonStandard());
        c1.afficherRecapitulatif();

        Commande c2 = new Commande(40.0, 5.0, new LivraisonExpress());
        c2.afficherRecapitulatif();

        Commande c3 = new Commande(15.0, 15.0, new ClickAndCollect());
        c3.afficherRecapitulatif();
    }
}
