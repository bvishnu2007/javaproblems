import java.util.*;

public class ProductInventory {
    public static void main(String[] args) {

        HashSet<String> p= new HashSet<>();

        // Storing products
        p.add("Laptop");
        p.add("Mobile");
        p.add("Keyboard");
        p.add("Mouse");
        p.add("Monitor");
        p.add("Mobile");
        p.add("Mouse");
        System.out.println(p);
        p.add("Headphones");
        p.add("Tablet");
        System.out.println(p);
        p.remove("Keyboard");
        System.out.println( p);
        System.out.println( p.contains("Laptop"));
        System.out.println( p.contains("Keyboard"));
        System.out.println("All Unique Products:");
        for (String pa : p) {
            System.out.println(pa);
        }
        System.out.println("Total Unique Products: " + p.size());
    }
}