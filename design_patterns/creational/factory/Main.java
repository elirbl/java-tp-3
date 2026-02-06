package creational.factory;

public class Main {
    public static void main(String[] args) {
        Burger commande1 = BurgerFactory.creerBurger(BurgerType.VEGGIE);
        Burger commande2 = BurgerFactory.creerBurger(BurgerType.CHEESE);
        Burger commande3 = BurgerFactory.creerBurger(BurgerType.CHICKEN);

        // Test
        traiterCommande(commande1);
        traiterCommande(commande2);
        traiterCommande(commande3);
    }

    private static void traiterCommande (Burger burger) {
        burger.preparer();
        System.out.println("Prix à payer : " + burger.getPrix() + "€");
        System.out.println("-----------------------------------");
    }
}