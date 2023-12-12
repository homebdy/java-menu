package menu.service;

import menu.domain.*;

public class MenuService {

    private final Coaches coaches = new Coaches();
    private final Categories categories = new Categories();

    public void addCoach(Name name, ForbiddenFood forbiddenFood) {
        coaches.addCoach(new Coach(name, forbiddenFood));
    }

    public void recommend() {
        categories.getCategories()
                .forEach(coaches::recommendFood);
    }

    public Coaches getCoaches() {
        return coaches;
    }

    public Categories getCategories() {
        return categories;
    }
}
