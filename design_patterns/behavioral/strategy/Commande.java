package behavioral.strategy;

public class Commande {
    private double prixPlats;
    private double distance;
    private StrategieLivraison strategie;

    public Commande(double prixPlats, double distance, StrategieLivraison strategie) {
        this.prixPlats = prixPlats;
        this.distance = distance;
        this.strategie = strategie;
    }

    public void setStrategie(StrategieLivraison strategie) {
        this.strategie = strategie;
    }

    public double calculerTotal() {
        double frais = strategie.calculerFrais(distance);
        return prixPlats + frais;
    }

    public void afficherRecapitulatif() {
        double frais = strategie.calculerFrais(distance);
        System.out.println("Plats: " + prixPlats + "€ | Frais (" +
                strategie.getClass().getSimpleName() + "): " +
                frais + "€ | Total: " + calculerTotal() + "€");
    }
}
