class InputValidator {
    String userInput = " ";

    void display() {
        if (userInput.isBlank()) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("Valid Input");
        }
    }
}

class Main {
    public static void main(String[] args) {
        InputValidator i = new InputValidator();
        i.display();
    }
}