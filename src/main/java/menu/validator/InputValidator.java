package menu.validator;

import menu.constant.ExceptionMessage;

import java.util.regex.Pattern;

public class InputValidator {

    private static final String DELIMITER_REGEXP = "^([a-zA-Zㄱ-힣]*,)*([a-zA-Zㄱ-힣]*)$";

    public void validateDelimiter(String input) {
        if (!Pattern.matches(DELIMITER_REGEXP, input)) {
            ExceptionMessage message = ExceptionMessage.INVALID_REGEX;
            throw new IllegalArgumentException(message.getMessage());
        }
    }
}