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

        ReactivePlane planeReactive1 = new ReactivePlane("Gloster Meteor", 1);
        planeReactive1.flyVeryVeryFast();

        BusinessJet planeBusiness1 = new BusinessJet("ИЛ-96",5 );
        planeBusiness1.transportPeople("Самара");

        Airliner planeAirliner1 = new Airliner("Boing-777", 250);
        planeAirliner1.transportAlotOfPeople("Уренгой");
        Airplane[] planes = {planeSport1, planeCorn1, planeBusiness1};

        planeExample(planes);

    }
public static void planeExample(Airplane[] planes){
       for (Airplane p: planes) p.fly();

       for (Airplane p:planes){
           if (p instanceof PistonAircraft) {
               PistonAircraft pp = (PistonAircraft) p;
               pp.makeFastTurn();
           }
           else
               System.out.println("этот самолёт не поршневой");
       }
}



}
