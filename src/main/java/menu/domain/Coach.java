package menu.domain;

public class Coach {

    private final Name name;
    private final ForbiddenFood forbiddenFood;
    private final RecommendFood recommendFood = new RecommendFood();

    public Coach(Name name, ForbiddenFood forbiddenFood) {
        this.name = name;
        this.forbiddenFood = forbiddenFood;
    }

    public void recommend(Category category) {
        recommendFood.recommend(category);
    }
}
