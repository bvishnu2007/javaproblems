interface Printable {
    void printDocument();
}
interface Scannable{
    void scanDocument();
}
class Smartphone implements Printable,Scannable{
    public void printDocument(){
        System.out.println("document printing");
    }
    public void scanDocument(){
        System.out.println("document scanning");
    }
}
class Main{
public static void main(String[] args){
    Smartphone sp=new Smartphone();
    sp.printDocument();
    sp.scanDocument();
}
}
