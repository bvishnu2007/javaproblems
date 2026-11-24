public class Printer {
    void print(String text){
        System.out.println( "Text: " + text);
    }
    void print(int number){
    System.out.println("Integer: " + number);
    }
    void print(double decimal){
        System.out.println("Decimal: " + decimal);
    }
}
class Main{
    public static void main(String[] args){
        Printer P=new Printer();
         P.print("vishnu");
         P.print(9);
         P.print(2.0);    
         }
}