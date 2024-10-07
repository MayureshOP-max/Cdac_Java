package day5;

public class Account {

    private int accountNumber;
    private double balance;
    private String name;
    private int transactionLimit = 0;

    public Account(int accountNumber, double balance, String name) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
    }
    public double deposit(double amount) throws IncorrectDenominationException {
        if (amount %500 != 0) {
            throw new IncorrectDenominationException("Amount must be in multiples of 500");
        }
        return balance += amount;
    }
    public double withdraw(double amount) throws InsufficientFundException,TransactionLimitException {
        if (amount > balance) {
            throw new InsufficientFundException("Insufficient Balance");
        }else{
            transactionLimit++;
            if(transactionLimit > 3){
                throw new TransactionLimitException("Transaction Limit Exceeded");
            }
            else{
                return balance -= amount;
            }

        }

    }

}
