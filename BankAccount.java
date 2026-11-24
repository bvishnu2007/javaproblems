abstract class BankAccount {
    abstract double calculateInterest();
    public void displayAccountType(){
        System.out.println("Bank Account Details");
    }
 
}
class SavingAccount extends BankAccount{
    double balance;
    @Override 

     public double  calculateInterest(){
        return balance * 0.05;

    }
}
class Main{
    public static void main(String[] args) {
        SavingAccount sa=new SavingAccount();
        sa.balance=50000;
       sa.displayAccountType();
 System.out.println("Interest: " + sa.calculateInterest());
    }
}