package structural.adapter;

import java.util.HashMap;
import java.util.Map;

public class CSVAdapter implements AnalyseurVentes {
    private LecteurCSV lecteur;

    public CSVAdapter(LecteurCSV lecteur) {
        this.lecteur = lecteur;
    }

    @Override
    public double getTotalVentes() {
        double total = 0;
        // On commence à 1 pour ignorer l'en-tête du CSV
        for (int i = 1; i < lecteur.getNbLignes(); i++) {
            total += calculerLigne(i);
        }
        return total;
    }

    @Override
    public int getNbCommandes() {
        // Le nombre de lignes moins l'en-tête
        return lecteur.getNbLignes() - 1;
    }

    @Override
    public Map<String, Double> getCAParProduit() {
        Map<String, Double> stats = new HashMap<>();

        for (int i = 1; i < lecteur.getNbLignes(); i++) {
            String[] cols = lecteur.getColonnes(i);
            String produit = cols[1];
            double montantLigne = calculerLigne(i);

            // On ajoute au montant déjà existant pour ce produit
            stats.put(produit, stats.getOrDefault(produit, 0.0) + montantLigne);
        }
        return stats;
    }

    // Méthode utilitaire interne pour gérer le format "prixxquantite"
    private double calculerLigne(int index) {
        String[] cols = lecteur.getColonnes(index);
        String prixQuantite = cols[2]; // ex: "8.50x3"
        String[] parts = prixQuantite.split("x");

        double prix = Double.parseDouble(parts[0]);
        int quantite = Integer.parseInt(parts[1]);

        return prix * quantite;
    }
}
