package menu.constant;

public enum ExceptionMessage {

    INCORRECT_DELIMITER("','로 구분하여 입력해야합니다.");

    private static final String PREFIX = "[ERROR] ";
    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return PREFIX + message;
    }
}