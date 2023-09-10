package menu.service;

import menu.domain.Categories;
import menu.domain.Coaches;

public class MenuService {

    private final Coaches coaches;

    public MenuService(Coaches coaches) {
        this.coaches = coaches;
    }

    public void recommend() {
        Categories categories = recommendCategory();
        categories.getElements()
                .forEach(coaches::recommendByCategory);
    }

    private Categories recommendCategory() {
        return new Categories();
    }
}
