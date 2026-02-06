package structural.facade;

public class LivraisonService {
    public boolean verifierLivreurDisponible() {
        System.out.println("[LivraisonService] Recherche d'un livreur disponible...");
        return true;
    }

    public boolean verifierPerimetre(String adresse) {
        System.out.println("[LivraisonService] Vérification de la zone pour : " + adresse);
        return true;
    }
}
