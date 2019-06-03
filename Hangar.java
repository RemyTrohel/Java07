public class Hangar{

    public static void main(String[] args){
        Car clio1 = new Car("Clio", 50000);
        Boat titanic1 = new Boat("Titanic", 1000000);

        System.out.println(clio1.doStuff());
        System.out.println(titanic1.doStuff());
    }
}