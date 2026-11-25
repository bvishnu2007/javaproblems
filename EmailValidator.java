public class EmailValidator {
    String  email="bvishnu@gmail.com";
    void display(){
        if((email.isEmpty()) && (email.contains("@")) && (email.endsWith("com")) && (email.startsWith("bvishnu"))){
            System.out.println("valid email");
        }
        else{
            System.out.println("invalid email");
            }

        }
    }
    
class Main{
    public static void main(String[] args) {
        EmailValidator ev=new EmailValidator();
        ev.display();
    }
}
