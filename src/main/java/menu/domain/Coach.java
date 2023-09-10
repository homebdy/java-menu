package menu.domain;

import java.util.List;

public class Coach {

    private final Name name;
    private final ExcludedMenu excludedMenu = new ExcludedMenu();
    private final RecommendMenu recommendMenu = new RecommendMenu();

    public Coach(Name name) {
        this.name = name;
    }

    public void addExcludedMenu(List<String> menu) {
        excludedMenu.addElements(menu);
    }

    public void recommendMenu(Category category) {
        recommendMenu.recommendMenu(category);
    }

    public String getName() {
        return name.getValue();
    }
}
