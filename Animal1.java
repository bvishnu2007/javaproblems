abstract  class Animal1 {
    abstract void  makeSound();
    void sleep(){
        System.out.println( "Animal is sleeping");
    }
}
class Dog extends Animal1{
void makeSound(){
    System.out.println("Dog barks: Woof! Woof!");
}
}
class Main{
    public static void main(String[] args){

        Dog d = new Dog();

        d.makeSound();
        d.sleep();

    
    }
}