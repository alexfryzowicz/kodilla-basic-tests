public class Car {
    private int wheels;
    private int seats;

    public Car(int wheels, int seats) {
        this.wheels = wheels;
        this.seats = seats;
        //System.out.println("convertible car");
    }

    public void turnOnLights() {
        System.out.println("lights were turned on");
    }

    public void openDoors() {
        System.out.println("opening 4 doors");
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public void displayNumberOfSeats() {
        System.out.println("number of sears: " + seats);
    }
}
