package menu.domain;

public class Coach {

    private final Name name;
    private final ForbiddenFood forbiddenFood;

    public Coach(Name name, ForbiddenFood forbiddenFood) {
        this.name = name;
        this.forbiddenFood = forbiddenFood;
    }
}
