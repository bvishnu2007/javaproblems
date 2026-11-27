import java.util.*;
public class ArrayList6 {
    public static void main(String[] args) {
        ArrayList<Integer> price = new ArrayList<>();
        price.add(100);
        price.add(250);
        price.add(500);
        price.add(150);
        price.add(800);
        price.add(300);
        price.add(120);
        price.add(450);
        price.add(900);
        price.add(200);
        System.out.println("Prices: " + price);
        price.add(2, 600);
        System.out.println("Updated prices: " + price);
        System.out.println(Collections.max(price));
        System.out.println(Collections.min(price));
        int total=0;
        for(int a : price){
            total=total+1;
        }
        System.out.println(total/price.size());

         Collections.sort(price);
        System.out.println("Sorted prices: " + price);
        System.out.println("Prices between 200 and 600:");
        for (int p : price) {
            if (p >= 200 && p <= 600) {
                System.out.println(p);
            }
        }
    }
}