package bankmanagementsystem;

abstract class Account {

    private final String accountHolder;
    private final String accountNumber;
    private double balance;

    Account(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void updateBalance(double amount) {
        balance = balance + amount;
    }

    abstract double calculateInterest();

    void displayDetails() {
        System.out.println("Account Holder :" + accountHolder);
        System.out.println("Account Number :" + accountNumber);
        System.out.println("Balance :" + balance);
    }
}
