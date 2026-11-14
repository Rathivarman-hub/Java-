package bankmanagementsystem;

interface BankOperations {

    void withdraw(double amount) throws InvalidAmountException,
            InsufficientBalanceException;

    void checkBalance();
}
