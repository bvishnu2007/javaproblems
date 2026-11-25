public class TextEditor {
    String variable="i love python programme";
    void display(){
        System.out.println(variable);
        
        System.out.println(variable.replace("python","Java"));
        System.out.println(variable.replace("o","0"));

    }
}
class Main{
    public static void main(String[] args) {
        TextEditor te=new TextEditor();
        te.display();
    }
}
