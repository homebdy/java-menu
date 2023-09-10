package menu.domain;

import java.util.List;

public class Coach {

    private final Name name;
    private final ExcludedMenu excludedMenu = new ExcludedMenu();

    public Coach(Name name) {
        this.name = name;
    }

    public void addExcludedMenu(List<String> menu) {
        excludedMenu.addElements(menu);
    }

    public String getName() {
        return name.getValue();
    }
}
