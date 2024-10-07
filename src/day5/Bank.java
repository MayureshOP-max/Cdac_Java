package day5;

public class Bank {
    public static void main(String[] args) throws IncorrectDenominationException,InsufficientFundException,TransactionLimitException{
        Account acc= new Account(100,50000,"Yash");
        try{
            acc.deposit(1000);
            acc.withdraw(800);

        }
        catch(IncorrectDenominationException | TransactionLimitException | InsufficientFundException e)
            {
            System.out.println(e.getMessage());
            }
    }

}
