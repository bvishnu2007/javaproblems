public class Calculator1 {
    void add(int a,int b){
System.out.println(a+b);
    }
    void add(int a, int b,int c){
        System.out.println(a+b+c);

    }
}
class Main{
    public static void main(String[] args) {
        Calculator1 cal=new Calculator1();
        cal.add(1,2);
        cal.add(1, 2, 3);
    }
}
