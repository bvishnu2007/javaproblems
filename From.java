public class From {
    String name="";
    void display(){
        if(name.isEmpty()){

        System.out.println("hello");
        }
    else{
        System.out.println("bye");

        }

        
    }
    
}
class Main{
    public static void main(String[] args) {
        From f=new From();
        f.display();
    }
}
