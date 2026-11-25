class UsernameValidator {
    String username = "Admin";
    String enteredUsername = "ADMIN";

    void checkUsername() {
        if (username.equalsIgnoreCase(enteredUsername)) {
            System.out.println("Valid Username");
        } else {
            System.out.println("Invalid Username");
        }
    }
}

class Main {
    public static void main(String[] args) {
        UsernameValidator ob = new UsernameValidator();
        ob.checkUsername();
    }
}