package creational.factory;

public class BurgerFactory {
    public static Burger creerBurger(BurgerType type) {
        return switch (type) {
            case VEGGIE -> new BurgerVeggie();
            case CHEESE -> new CheeseBurger();
            case CHICKEN -> new ChickenBurger();
            default -> throw new IllegalArgumentException("Type de burger inconnu");
        };
    }
}