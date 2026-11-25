class NameExtractor {
    String fullName = "Java Full Stack Developer";

    public void display() {
        String first = fullName.substring(0, 4);
        String second = fullName.substring(5, 9);
        String remaining = fullName.substring(10);

        System.out.println(first);
        System.out.println(second);
        System.out.println(remaining);
    }
}

class Main {
    public static void main(String[] args) {
        NameExtractor n = new NameExtractor();
n.display();
    }
}