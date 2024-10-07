package day5;

public class TransactionLimitException extends Exception {
    public TransactionLimitException(String message) {
        super(message);
    }
}
