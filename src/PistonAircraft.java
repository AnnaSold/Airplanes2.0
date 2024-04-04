public class PistonAircraft extends Airplane { //Поршневой самолет
    public PistonAircraft(String name, int capacity) {
        super(name, capacity);
    }
    public void makeFastTurn(){
        System.out.println(this.getName() + " " + "совершает вираж за 12 секунд");
    }
}
class CornMackerel extends PistonAircraft{  //Кукурузник
    public CornMackerel(String name, int capacity) {
        super(name, capacity);
    }
    public void sprayFertilizer(){
        System.out.println(this.getName() + " " + "распыляет удобрения");
    }
}

class SportPlane extends PistonAircraft{
    public SportPlane(String name, int capacity) {
        super(name, capacity);
    }
    public void blowSmoke(String color){
        System.out.println(this.getName() + " пустил дым "+  color + " цвета");

    }
}
