public class Convertible extends Car {
    public void openRoof() {
        System.out.println("opening roof...");
    }
    public void closeRoof() {
        System.out.println("closing roof...");
    }
    @Override
    public void openDoors() {
        System.out.println("opening 2 doors");
    }
    public Convertible(int wheels, int seats) {
        super(wheels, seats);
       // System.out.println("convertible constructor");
    }
}