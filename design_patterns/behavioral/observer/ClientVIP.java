package behavioral.observer;

public class ClientVIP {
    private String nom;

    public ClientVIP(String nom) {
        this.nom = nom;
    }

    public void actualiser(Promotion promo) {
        System.out.println("Notification pour " + nom + " : " +
                "Vite ! Nouvelle promo flash : " + promo);
    }
}
