import java.util.*;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> s=new LinkedList<>();
        s.add("hello");
        s.add("hlo");
        s.add("bye");
        System.out.println(s);
        s.addFirst("qwe");
        s.addLast("qwe");
        System.out.println(s);
        s.removeFirst();
         s.removeLast();
        System.out.println(s);
        s.getFirst();
        s.getLast();
        System.out.println(s.getFirst());
        System.out.println(s.getLast());
        System.out.println(s.contains("bye"));
        String curr=s.removeFirst();
        System.out.println(curr);

    }
}
