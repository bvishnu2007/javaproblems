import java.util.*;
public class Ticket {
    public static void main(String[] args) {
        String passengerName="vishnu";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the position number");
        int n=sc.nextInt();
        try{
            System.out.println(passengerName.charAt(n));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("invalid");
        }
    }
}
