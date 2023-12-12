package menu.service;

import menu.domain.Coach;
import menu.domain.Coaches;
import menu.domain.ForbiddenFood;
import menu.domain.Name;

public class MenuService {

    private final Coaches coaches = new Coaches();

    public void addCoach(Name name, ForbiddenFood forbiddenFood) {
        coaches.addCoach(new Coach(name, forbiddenFood));
    }
}
