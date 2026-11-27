import java.util.*;

class StudentMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter marks for Subject 1: ");
            int m1 = sc.nextInt();
            System.out.print("Enter marks for Subject 2: ");
            int m2 = sc.nextInt();
            System.out.print("Enter marks for Subject 3: ");
            int m3 = sc.nextInt();
            int total = m1 + m2 + m3;
            double average = total / 3.0;
            System.out.println("Total Marks: " + total);
            System.out.println("Average Marks: " + average);
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter numeric marks only");
        }

        sc.close();
    }
}