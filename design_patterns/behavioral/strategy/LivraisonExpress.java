package behavioral.strategy;

public class LivraisonExpress implements StrategieLivraison {
    @Override
    public double calculerFrais(double distance) {
        return (distance * 1.5) + 2.0;
    }
}
