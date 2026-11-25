class StudentNameProcessor {
    String fullName = " rahul kumar ";

    void display() {
        String cleanedName = fullName.trim();
        String upperName = cleanedName.toUpperCase();
        int count = cleanedName.length();
        int space = cleanedName.indexOf(" ");
        String firstName = cleanedName.substring(0, space);
        String lastName = cleanedName.substring(space + 1);
        boolean result = upperName.startsWith("RAHUL");

        System.out.println("Original Name: " + fullName);
        System.out.println("Cleaned Name: " + cleanedName);
        System.out.println("Uppercase Name: " + upperName);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Character Count: " + count);
        System.out.println("Validation: " + result);
    }
}

class Main {
    public static void main(String[] args) {
        StudentNameProcessor s = new StudentNameProcessor();
        s.display();
    }
}