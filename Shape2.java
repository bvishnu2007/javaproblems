public class Shape2 {
    void draw(){
        System.out.println("Drawing a shape");

    }
}
class Circle extends Shape2{

void draw(){
    System.out.println("Drawing a shape");
}
}
class Square extends Shape2{
    void draw(){
        System.out.println("Drawing a square");

    }

}
class Main{
 public static void main(String[] args) {
Circle c=new Circle();
Square s=new Square();
s.draw();
c.draw();
    }
}
