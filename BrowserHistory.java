import java.util.*;

public class BrowserHistory {
    public static void main(String[] args) {
        LinkedList<String> s = new LinkedList<>();
        s.add("Google");
        s.add("YouTube");
        s.add("Instagram");
        s.add("Amazon");
        s.add("GitHub");
        s.add("ChatGPT");
        System.out.println("History: " + s);
        String curr = s.removeLast();
        System.out.println( s.getFirst());
        System.out.println(curr);
        System.out.println(s.getLast());
        System.out.println(  s.contains("YouTube"));
        s.clear();
        System.out.println("After clearing: " + s);
    }
}