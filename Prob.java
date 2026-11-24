
class Prob{
    String name;
    double marks;
    Prob(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
    void showResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
    }
}
class Main {
    public static void main(String[] args) {

        Prob s1 = new Prob("Vishnu", 90.5);
        Prob s2 = new Prob("Suhas", 85.5);

        s1.showResult();
        s2.showResult();
    }
}
