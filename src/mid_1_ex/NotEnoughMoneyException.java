package mid_1_ex;

public class NotEnoughMoneyException extends RuntimeException {
    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
