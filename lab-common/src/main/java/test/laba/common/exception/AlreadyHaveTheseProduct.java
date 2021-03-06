package test.laba.common.exception;

public class AlreadyHaveTheseProduct extends Exception {
    private final String message;

    public AlreadyHaveTheseProduct(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
