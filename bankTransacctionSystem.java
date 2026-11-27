class BankTransaction {
    int balance = 10000;
    void withdraw(String amount) {
        try {
            int withdrawAmount = Integer.parseInt(amount);
            if (withdrawAmount <= 0) {
                throw new IllegalArgumentException("Withdrawal amount must be positive");
            }
            if (withdrawAmount > balance) {
                throw new IllegalArgumentException("Insufficient balance");
            }
            balance = balance - withdrawAmount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid amount format");
        }
    }

    public static void main(String[] args) {

        BankTransaction b = new BankTransaction();

        System.out.println("Transaction 1");
        b.withdraw("2000");

        System.out.println("Transaction 2");
        b.withdraw("15000");

        System.out.println("Transaction 3 ");
        b.withdraw("abc");

        System.out.println(" Transaction 4");
        b.withdraw("-500");

        System.out.println("Transaction 5");
        b.withdraw("0");
    }
}