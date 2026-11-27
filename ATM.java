public class ATM {
    public static void main(String[] args) {

        double balance = 10000;
        double withdrawamount = 0;

        try {
            double ans = (int) balance / (int) withdrawamount;
            System.out.println(ans);
        }
        catch (ArithmeticException e) {
            System.out.println("Invalid withdrawal amount");
        }
    }
}