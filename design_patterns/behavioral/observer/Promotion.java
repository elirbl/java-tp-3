package behavioral.observer;

public class Promotion {
    private String nom;
    private int remisePourcentage;

    public Promotion(String nom, int remisePourcentage) {
        this.nom = nom;
        this.remisePourcentage = remisePourcentage;
    }

    @Override
    public String toString() {
        return nom + " (-" + remisePourcentage + "%)";
    }
}
