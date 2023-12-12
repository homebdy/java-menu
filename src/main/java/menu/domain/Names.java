package menu.domain;

import menu.constant.ExceptionMessage;

import java.util.ArrayList;
import java.util.List;

public class Names {

    private static final int MIN_SIZE = 2;
    private static final int MAX_SIZE = 5;

    private final List<Name> elements;

    public Names(List<Name> elements) {
        validateElementsSize(elements);
        this.elements = new ArrayList<>(elements);
    }

    private void validateElementsSize(List<Name> elements) {
        if (!(MIN_SIZE <= elements.size() && elements.size() <= MAX_SIZE)) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_COACH_NUMBER.getMessage());
        }
    }
}
