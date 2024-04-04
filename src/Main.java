public class Main {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Ту-24", 200);
        plane1.fly();
        PistonAircraft planePiston1 = new PistonAircraft("Cessna 340",2);
        planePiston1.makeFastTurn();
        CornMackerel planeCorn1 = new CornMackerel("Аннушка", 1);
        planeCorn1.sprayFertilizer();
        SportPlane planeSport1 = new SportPlane("Су-26", 1);
        planeSport1.blowSmoke("синего");

    }
}
