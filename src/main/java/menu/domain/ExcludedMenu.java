package menu.domain;

import menu.constant.ExceptionMessage;

import java.util.ArrayList;
import java.util.List;

public class ExcludedMenu {

    private static final int MAX_SIZE = 2;

    private final List<String> elements = new ArrayList<>();

    public void addElements(List<String> menus) {
        validateSize(menus);
        elements.addAll(menus);
    }

    private void validateSize(List<String> menus) {
        if (!(menus.size() <= MAX_SIZE)) {
            throw new IllegalArgumentException(ExceptionMessage.EXCLUDED_FOOD_SIZE.toString());
        }
    }

    public boolean canEat(String menu) {
        return !(elements.contains(menu));
    }
}
