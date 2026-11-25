class Input{
    String username = " JavaDeveloper ";

    public void display() {
        String cleaned = username.trim();

        System.out.println("Original string: " + username);
        System.out.println("Original length: " + username.length());
        System.out.println("Cleaned string: " + cleaned);
        System.out.println("Cleaned length: " + cleaned.length());
    }
}

class Main {
    public static void main(String[] args) {
        Input i = new Input();
        i.display();
    }
}