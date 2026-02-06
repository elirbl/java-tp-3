package creational.singleton;

public class TPE {
    private static TPE instance;
    private double chiffreAffaires;

    private TPE() {
        this.chiffreAffaires = 0.0;
    }

    public static TPE getInstance() {
        if (instance == null) {
            instance = new TPE();
        }
        return instance;
    }

    public void encaisser(double montant) {
        if (montant > 0) {
            this.chiffreAffaires += montant;
            System.out.println("Encaissé : " + montant + "€. Nouveau total : " + this.chiffreAffaires + "€.");
        }
    }

    public double getChiffreAffaires() {
        return chiffreAffaires;
    }

    public void resetJournee() {
        this.chiffreAffaires = 0.0;
        System.out.println("TPE réinitialisé. Le chiffre d'affaires est à 0€.");
    }
}
