package Inheritance;

public class Car extends Vehicle {
    public int seat;

    public Car(String brand, String modelName, int year, int seat) {
        super(brand, modelName, year);
        this.seat = seat;
    }

    public void honk() {
        System.out.println("This car is tut-tut-ing");
    }
}
