package menu.domain;

public class Coach {

    private final Name name;
    private final RecommendFood recommendFood;

    public Coach(Name name, ForbiddenFood forbiddenFood) {
        this.name = name;
        this.recommendFood = new RecommendFood(forbiddenFood);
    }

    public void recommend(Category category) {
        recommendFood.recommend(category);
    }
}
