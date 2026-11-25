import java.util.LinkedHashMap;

class LinkedHashMap1 {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();

        students.put(104, "Sharath");
        students.put(101, "Vishnu");
        students.put(103, "Prajwal");
        students.put(102, "Suhas");

        System.out.println(students);
    }
}