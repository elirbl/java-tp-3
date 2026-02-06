package creational.builder;
import java.util.List;

public class Sandwich {
    private final String pain; // Obligatoire
    private final String viande;
    private final String fromage;
    private final List<String> legumes;
    private final String sauce;
    private final boolean estGrille;

    protected Sandwich(SandwichBuilder builder) {
        this.pain = builder.pain;
        this.viande = builder.viande;
        this.fromage = builder.fromage;
        this.legumes = builder.legumes;
        this.sauce = builder.sauce;
        this.estGrille = builder.estGrille;
    }

    @Override
    public String toString() {
        return "Sandwich [" + pain + (viande != null ? ", " + viande : "") +
                (fromage != null ? ", " + fromage : "") +
                (!legumes.isEmpty() ? ", Légumes: " + legumes : "") +
                (sauce != null ? ", Sauce: " + sauce : "") +
                (estGrille ? ", GRILLÉ" : "") + "]";
    }
}