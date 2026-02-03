public class SandwichBuilder {
    protected String pain;
    protected String viande;
    protected String fromage;
    protected List<String> legumes = new ArrayList<>();
    protected String sauce;
    protected boolean estGrille = false;

    public SandwichBuilder(String pain) {
        this.pain = pain;
    }

    public SandwichBuilder avecViande(String viande) {
        this.viande = viande;
        return this;
    }

    public SandwichBuilder avecFromage(String fromage) {
        this.fromage = fromage;
        return this;
    }

    public SandwichBuilder ajouterLegume(String legume) {
        this.legumes.add(legume);
        return this;
    }

    public SandwichBuilder avecSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public SandwichBuilder estGrille(boolean grille) {
        this.estGrille = grille;
        return this;
    }

    public Sandwich build() {
        return new Sandwich(this);
    }
}