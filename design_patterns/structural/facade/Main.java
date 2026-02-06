package structural.facade;

public class Main {
    public static void main(String[] args) {
        CommandeValidationFacade facade = new CommandeValidationFacade();

        String utilisateur = "User_123";
        String adresseLivraison = "15 Rue de la Paix, Paris";

        boolean commandeOk = facade.validerCommande(utilisateur, adresseLivraison);

        if (commandeOk) {
            System.out.println("Résultat : Votre burger arrive bientôt !");
        } else {
            System.out.println("Résultat : Impossible de valider la commande.");
        }
    }
}
