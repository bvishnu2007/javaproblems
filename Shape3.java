abstract  class Shape3 {
    abstract double calculateArea();
    void displayMessage(){
        System.out.println("Calculating area of the shape...");
    }
}
class Circle extends Shape3{
    double radius;
    double calculateArea(){
        return 3.14*radius*radius;
    }
}
class Main{public static void main(String[] args) {
    Circle c=new Circle();
    c.radius=9;
    c.displayMessage();
    System.out.println(c.calculateArea());
}
}
