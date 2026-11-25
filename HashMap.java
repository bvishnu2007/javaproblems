import java.util.HashMap;

class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Vishnu", 90);
        marks.put("Saran", 85);
        marks.put("Rahul", 90);

        System.out.println(marks);
        System.out.println(marks.get("Vishnu"));
    }
}