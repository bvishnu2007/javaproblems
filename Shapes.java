
interface Shapes {
    void calculateArea(double value);
}

class Square implements Shapes {

    public void calculateArea(double side) {
        System.out.println("Square Area: " + (side * side));
    }
}

class Circle implements Shapes {

    public void calculateArea(double radius) {
        System.out.println("Circle Area: " + (3.14 * radius * radius));
    }
}

class Main {
    public static void main(String[] args) {

        Shapes s1 = new Square();
        Shapes s2 = new Circle();

        s1.calculateArea(5.0);
        s2.calculateArea(5.0);
    }
}
