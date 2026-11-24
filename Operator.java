import java.util.Scanner;
public class Operator
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first number:");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        System.out.println("enter your choice");
        int ch=sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("addition of two numbers is:"+(a+b));
                break;
            case 2:
                System.out.println("subtraction of two numbers is:"+(a-b));
                break;
            case 3:
                System.out.println("multiplication of two numbers is:"+(a*b));      
                break;
            case 4:
                System.out.println("division of two numbers is:"+(a/b));
                break;          
            default:
                System.out.println("invalid choice");
                break;

        }

    }
}