
class Employees {
    int id;
    String name;
    String department;
    Employees(int id, String name) {
        this(id, name, "General");
    }
    Employees(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
    void displayEmployees() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("-------------------");
    }
}
class Main {
    public static void main(String[] args) {
        Employees e1 = new Employees(101, "Vishnu");
        Employees e2 = new Employees(102, "Suhas", "IT");
        e1.displayEmployees();
        e2.displayEmployees();
    }
}
