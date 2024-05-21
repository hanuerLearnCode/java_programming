package Inheritance;

public class Vehicle {
    public String brand;
    public String modelName;
    public int year;

//    public Vehicle() {}
    public Vehicle(String brand, String modelName, int year) {
        this.brand = brand;
        this.modelName = modelName;
        this.year = year;
    }

    public void honk() {
        System.out.println("This vehicle is tut-tut-ing");
    }
}
