package creational.builder;

public class Main {
    public static void main(String[] args) {
        Sandwich s1 = new SandwichBuilder("baguette").avecViande("jambon").build();
        Sandwich s2 = new SandwichBuilder("complet").avecSauce("mayo").estGrille(true).build();
        Sandwich s3 = new SandwichBuilder("ciabatta").avecViande("poulet").ajouterLegume("tomate").build();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}