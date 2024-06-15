package L18_exceptions;

public class LowBalanceException extends Exception {

    @Override
    public String toString() {
        return "Balance to lowed";
    }

}
