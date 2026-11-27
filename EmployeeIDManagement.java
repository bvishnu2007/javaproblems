import java.util.*;

public class EmployeeIDManagement {
    public static void main(String[] args) {
        TreeSet<Integer> emp = new TreeSet<>();
        emp.add(105);
        emp.add(102);
        emp.add(108);
        emp.add(101);
        emp.add(106);
        emp.add(103);
        System.out.println("Employee IDs: " + emp);
        emp.add(107);
        System.out.println("After adding new ID: " + emp);
        emp.remove(103);
        System.out.println("After removing ID 103: " + emp);
        System.out.println("Smallest ID: " + emp.first());
        System.out.println("Largest ID: " + emp.last());
        System.out.println("Higher than 105: " + emp.higher(105));
        System.out.println("Lower than 105: " + emp.lower(105));
        System.out.println("IDs below 106: " + emp.headSet(106));
        System.out.println("IDs from 106 onwards: " + emp.tailSet(106));
        System.out.println("IDs between 105 and 108: " + emp.subSet(105, true, 108, true));
    }
}