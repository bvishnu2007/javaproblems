public class MessageBuilder {
   String firstname="java";
   String lastname="developer";
   void display(){
    System.out.println(firstname.concat(lastname));
   } 
}
class Main{
    public static void main(String[] args) {
        MessageBuilder mb=new MessageBuilder();
        mb.display();
    }
}
