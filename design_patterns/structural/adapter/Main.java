package structural.adapter;

public class Main {
    public static void main(String[] args) {
        try {
            LecteurCSV lecteur = new LecteurCSV("ventes.csv");
            AnalyseurVentes adaptateur = new CSVAdapter(lecteur);
            BurgerAnalytics analytics = new BurgerAnalytics(adaptateur);
            analytics.genererRapport();
        } catch (RuntimeException e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}
