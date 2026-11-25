class Word{
    String word = "banana";
    void display() {
        System.out.println(  word.indexOf('a'));
        
        System.out.println(  word.lastIndexOf('a'));
        System.out.println(  word.indexOf('n'));

        System.out.println(  word.lastIndexOf('n'));

    }
}
class Main {
    public static void main(String[] args) {
        Word ob = new Word();
        ob.display();
    }
}