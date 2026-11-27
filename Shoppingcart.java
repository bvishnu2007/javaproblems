import java.util.*;

public class Shoppingcart {
    public static void main(String[] args) {
       
        String[] product = {"Laptop", "Mobile", "Headphones", "Keyboard","Mouse"};
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter product position: ");
         int n= sc.nextInt();
        
        try {
            System.out.println(product[n]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
        }

    }
    
}