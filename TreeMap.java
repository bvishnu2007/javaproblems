import java.util.TreeMap;

class TreeMap1 {
    public static void main(String[] args) {

        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(104, "Sharath");
        students.put(101, "Vishnu");
        students.put(103, "Prajwal");
        students.put(102, "Suhas");

        System.out.println(students);
    }
}