class StudentDetails {
    String details = "vishnu,22,Java,85";

    void display() {
        String[] arr = details.split(",");

        System.out.println("Name: " + arr[0]);
        System.out.println("Age: " + arr[1]);
        System.out.println("Course: " + arr[2]);
        System.out.println("Marks: " + arr[3]);
    }
}

class Main {
    public static void main(String[] args) {
        StudentDetails s = new StudentDetails();
        s.display();
    }
}