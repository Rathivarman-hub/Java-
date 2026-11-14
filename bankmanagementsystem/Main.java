package bankmanagementsystem;

public class Main {

    public static void main(String[] args) {
        SavingsAccount a1 = new SavingsAccount("Rathi", "12@12", 5000);
        CurrentAccount a2 = new CurrentAccount("Rathi", "12@12", 5000);
        a1.displayDetails();
        System.out.println(a1.calculateInterest());
        try {
            a1.deposit(2000);
            a1.withdraw(3000);
            a1.withdraw(50000);
        } catch (InvalidAmountException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        a1.checkBalance();
        a2.displayDetails();
        System.out.println(a2.calculateInterest());
        try {
            a2.deposit(2000);
            a2.withdraw(3000);
            a2.withdraw(50000);
        } catch (InvalidAmountException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        a2.checkBalance();
    }
}
