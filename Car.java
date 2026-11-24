
class Car {
    String brand;
    int year;
    Car() {
        brand = "Toyota";
        year = 2024;
    }
    void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Year: " + year);
    }
}

class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.displayDetails();
    }
}
