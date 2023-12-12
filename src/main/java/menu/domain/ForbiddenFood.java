package menu.domain;

import menu.constant.ExceptionMessage;

import java.util.ArrayList;
import java.util.List;

public class ForbiddenFood {

    private static final int MIN_SIZE = 0;
    private static final int MAX_SIZE = 2;

    private final List<String> elements;

    public ForbiddenFood(List<String> elements) {
        validateSize(elements);
        this.elements = new ArrayList<>(elements);
    }

    private void validateSize(List<String> elements) {
        if (!(MIN_SIZE <= elements.size() && elements.size() <= MAX_SIZE)) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_FORBIDDEN_FOOD_NUMBER.getMessage());
        }
    }

    public boolean isForbidden(String menu) {
        return elements.contains(menu);
    }
}
