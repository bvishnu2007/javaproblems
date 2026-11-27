import java.util.*;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Vishnu");
        employees.add("Suhas");
        employees.add("Prajwal");
        employees.add("Sharath");
        employees.add("Pavan");
        employees.add("Rahul");
        employees.remove("Prajwal");
        employees.remove("Pavan");
        System.out.println("Present Employees: " + employees);
        System.out.println("Is Suhas present? " + employees.contains("Suhas"));
        System.out.println("Total Present Employees: " + employees.size());
        System.out.println("Reverse Order:");
        for (int i = employees.size() - 1; i >= 0; i--) {
            System.out.println(employees.get(i));
        }
    }
}