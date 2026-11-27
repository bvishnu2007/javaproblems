import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> num=new ArrayList<>();
        ArrayList<Integer> quan = new ArrayList<>();
        num.add("slippers");
        quan.add(2);
        num.add("shirts");
        quan.add(4);
        num.add("pants");
        quan.add(3);
        num.add("mobile");
        quan.add(1);
        num.add("laptops");
        quan.add(2);
        num.remove("mobile");
        System.out.println(num);
        System.out.println(quan);
        System.out.println( num.contains("slippers"));
        int total = 0;
       for (int a : quan) {
       total = total + a;
}
        System.out.println(total);

          num.clear();
        quan.clear();
        System.out.println( num);
        System.out.println( quan);
    

        

        
    }
}
