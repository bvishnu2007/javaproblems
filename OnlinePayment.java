import java.util.Scanner;
public class OnlinePayment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a payment amount");
        String PaymentAmount=sc.nextLine();
    try{
        double amount = Double.parseDouble(PaymentAmount);
            System.out.println("Payment amount: " + amount);
        }
catch(NumberFormatException e){
    System.out.println("invalid payment Amount");
}
    }

}

