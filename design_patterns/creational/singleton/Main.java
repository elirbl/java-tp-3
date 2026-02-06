package creational.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Début de la Journée 1 ---");

        TPE tpeCaissier1 = TPE.getInstance();
        tpeCaissier1.encaisser(8.0);

        TPE tpeCaissier2 = TPE.getInstance();
        tpeCaissier2.encaisser(10.0);

        TPE tpeCaissier3 = TPE.getInstance();
        tpeCaissier3.encaisser(9.0);

        System.out.println("\nBilan Journée 1 : " + TPE.getInstance().getChiffreAffaires() + "€");

        TPE.getInstance().resetJournee();

        System.out.println("\n--- Début de la Journée 2 ---");
        TPE.getInstance().encaisser(15.0);
        System.out.println("Bilan provisoire Journée 2 : " + TPE.getInstance().getChiffreAffaires() + "€");
    }
}
