package structural.facade;

public class CommandeValidationFacade {
    private final AuthService auth;
    private final StockService stock;
    private final PlanningService planning;
    private final LivraisonService livraison;

    public CommandeValidationFacade() {
        this.auth = new AuthService();
        this.stock = new StockService();
        this.planning = new PlanningService();
        this.livraison = new LivraisonService();
    }

    public boolean validerCommande(String adresseClient, String adresseLivraison) {
        System.out.println("--- DÉBUT DE LA VALIDATION DE COMMANDE ---");

        // Orchestration des vérifications
        if (!auth.estConnecte()) return false;
        if (!stock.verifierIngredients()) return false;
        if (!planning.verifierTempsPreparation()) return false;
        if (!livraison.verifierLivreurDisponible()) return false;
        if (!livraison.verifierPerimetre(adresseClient)) return false;

        System.out.println("--- COMMANDE VALIDÉE AVEC SUCCÈS ---");
        return true;
    }
}