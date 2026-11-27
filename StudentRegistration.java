import java.util.Scanner;

class StudentRegistration {

    String studentName;
    int age;
    String marks;
    String[] subjects = {"Java", "Python", "SQL", "React"};
    void register(Scanner sc) {
        try {
            System.out.print("Enter student name: ");
            studentName = sc.nextLine();

            if (studentName.equals("null")) {
                studentName = null;
            }
            if (studentName == null) {
                throw new NullPointerException();
            }
            System.out.println("Name length: " + studentName.length());
            System.out.print("Enter age: ");
            age = Integer.parseInt(sc.nextLine());
            if (age <= 0) {
                throw new IllegalArgumentException("Age must be greater than zero");
            }
            System.out.print("Enter marks: ");
            marks = sc.nextLine();
            int marksValue = Integer.parseInt(marks);
            System.out.println("Marks: " + marksValue);       
            System.out.println("Available Subjects:");
            for (int i = 0; i < subjects.length; i++) {
                System.out.println((i + 1) + ". " + subjects[i]);
            }
            System.out.print("Enter subject position: ");
            int position = Integer.parseInt(sc.nextLine());
            System.out.println("Selected Subject: " + subjects[position - 1]);
            System.out.println("Student Registration Completed");
        }
        catch (NullPointerException e) {
            System.out.println("Student name cannot be null");
        }
        catch (NumberFormatException e) {
            System.out.println("Please enter numeric values only");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid subject position");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentRegistration s = new StudentRegistration();
        s.register(sc);
    }
}