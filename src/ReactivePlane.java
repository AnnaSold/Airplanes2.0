public class ReactivePlane extends Airplane {
    public ReactivePlane(String name, int capacity) {
        super(name, capacity);
    }
    public void flyVeryVeryFast(){
        System.out.println(this.getName() + " летит очень очень быстро");
    }

}
class BusinessJet extends Airplane{
    public BusinessJet(String name, int capacity) {
        super(name, capacity);
    }
    public void transportPeople(String city){
        System.out.println(this.getName() + " перевозит мало людей в " + city);
    }
}
class Airliner extends Airplane{
    public Airliner(String name, int capacity) {
        super(name, capacity);
    }
    public void transportAlotOfPeople(String city){
        System.out.println(this.getName() + " перевозит очень много людей в " + city);
    }
}