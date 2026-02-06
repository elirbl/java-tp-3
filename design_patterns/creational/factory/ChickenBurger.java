package creational.factory;

public class ChickenBurger implements Burger {
    @Override
    public void preparer() {
        System.out.println("Préparation Chicken : Pain burger, poulet pané, sauce BBQ.");
    }

    @Override
    public double getPrix() { return 9.0; }
}