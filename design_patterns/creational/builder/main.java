public class Sandwicherie {
    public static void main(String[] args) {

        // 1. Le Classique (Pain complet, Jambon, Emmental, Grillé)
        Sandwich classique = new SandwichBuilder("Complet")
                .avecViande("Jambon")
                .avecFromage("Emmental")
                .estGrille(true)
                .build();

        // 2. Le Végétarien (Baguette, plein de légumes, Mayo)
        Sandwich veggie = new SandwichBuilder("Baguette")
                .ajouterLegume("Laitue")
                .ajouterLegume("Tomate")
                .ajouterLegume("Oignon")
                .avecSauce("Mayo")
                .build();

        // 3. Le Carnivore (Ciabatta, Rosbif, Cheddar, Sauce Moutarde)
        Sandwich carnivore = new SandwichBuilder("Ciabatta")
                .avecViande("Rosbif")
                .avecFromage("Cheddar")
                .avecSauce("Moutarde")
                .build();
    }
}