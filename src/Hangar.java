public class Hangar {

    public static void main(String[] args){
        Car clio = new Car("Clio", 25);
        Boat titanic = new Boat("Titanic", 300000);

        System.out.println("1. " + clio.doStuff());
        System.out.println("2. " + titanic.doStuff());
    }
}
