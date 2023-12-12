package menu.service;

import menu.domain.*;

public class MenuService {

    private final Coaches coaches = new Coaches();

    public void addCoach(Name name, ForbiddenFood forbiddenFood) {
        coaches.addCoach(new Coach(name, forbiddenFood));
    }

    public void recommend() {
        Categories categories = new Categories();
    }
}
