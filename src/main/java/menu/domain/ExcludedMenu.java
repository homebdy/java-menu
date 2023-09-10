package menu.domain;

import java.util.ArrayList;
import java.util.List;

public class ExcludedMenu {

    private final List<String> elements = new ArrayList<>();

    public void addElements(List<String> menus) {
        elements.addAll(menus);
    }

    public boolean canEat(String menu) {
        return !(elements.contains(menu));
    }
}
