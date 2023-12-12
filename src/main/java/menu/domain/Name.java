package menu.domain;

import menu.constant.ExceptionMessage;

public class Name {

    private static final int MIN_NAME_LENGTH = 2;
    private static final int MAX_NAME_LENGTH = 4;

    private final String value;

    public Name(String value) {
        validateNameLength(value);
        this.value = value;
    }

    private void validateNameLength(String value) {
        if (!(MIN_NAME_LENGTH <= value.length() && value.length() <= MAX_NAME_LENGTH)) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_NAME_LENGTH.getMessage());
        }
    }

    public String getValue() {
        return value;
    }
}
