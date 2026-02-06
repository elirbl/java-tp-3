package behavioral.strategy;

public class LivraisonStandard implements StrategieLivraison {
    @Override
    public double calculerFrais(double distance) {
        return distance * 0.5;
    }
}
