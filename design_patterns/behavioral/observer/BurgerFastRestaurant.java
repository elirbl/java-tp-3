package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class BurgerFastRestaurant {
    private List<ClientVIP> clientsVip = new ArrayList<>();

    public void ajouterClientVip(ClientVIP client) {
        clientsVip.add(client);
    }

    public void retirerClientVip(ClientVIP client) {
        clientsVip.remove(client);
    }

    public void emettrePromotionFlash(String nom, int remise) {
        Promotion nouvellePromo = new Promotion(nom, remise);
        System.out.println("\n--- [Resto] Lancement de la promo : " + nouvellePromo + " ---");

        for (ClientVIP client : clientsVip) {
            client.actualiser(nouvellePromo);
        }
    }
}
