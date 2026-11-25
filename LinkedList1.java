import java.util.*;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> num=new LinkedList<>();
        num.add(10);
        System.out.println(num.get(0));
        num.remove(0);
        System.out.println(num);
    }
}
