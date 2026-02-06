package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        BurgerFastRestaurant restaurant = new BurgerFastRestaurant();

        ClientVIP client1 = new ClientVIP("Léna");
        ClientVIP client2 = new ClientVIP("Alexandre");
        ClientVIP client3 = new ClientVIP("Noah");

        restaurant.ajouterClientVip(client1);
        restaurant.ajouterClientVip(client2);
        restaurant.ajouterClientVip(client3);

        restaurant.emettrePromotionFlash("Heure de pointe Burger", 30);

        restaurant.retirerClientVip(client2);

        restaurant.emettrePromotionFlash("Midnight Snack", 50);
    }
}
