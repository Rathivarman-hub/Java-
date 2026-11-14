package bankmanagementsystem;

class SavingsAccount extends Account implements BankOperations {

    SavingsAccount(String accountHolder, String accountNumber, double balance) {
        super(accountHolder, accountNumber, balance);
    }

    @Override
    double calculateInterest() {
        return getBalance() * 0.05;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid Amount");
        } else {
            updateBalance(amount);
        }
    }

    @Override
    public void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid Amount");
        } else if (amount > getBalance()) {
            throw new InsufficientBalanceException("In sufficient Balance");
        } else {
            updateBalance(-amount);
            System.out.println("Remaining Amount : " + getBalance());
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Remaining Balance : " + getBalance());
    }
}
