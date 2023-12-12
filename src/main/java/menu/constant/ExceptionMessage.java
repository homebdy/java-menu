package menu.constant;

public enum ExceptionMessage {

    INVALID_REGEX("공백없이 ','로만 나누어 입력해주세요."),
    INVALID_NAME_LENGTH("각 코치의 이름은 2~4글자까지만 입력할 수 있습니다.");

    private static final String PREFIX = "[ERROR] ";
    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return PREFIX + message;
    }
    }