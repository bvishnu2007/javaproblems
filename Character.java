class CharacterFinder {
    String word = "Programming";
    void findCharacters() {
        System.out.println(  word.indexOf('g'));
        System.out.println( word.indexOf('m'));
        System.out.println( word.indexOf('z'));
    }
}
class Main {
    public static void main(String[] args) {
        CharacterFinder ob = new CharacterFinder();
        ob.findCharacters();
    }
}