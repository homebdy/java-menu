package menu.domain;

import java.util.ArrayList;
import java.util.List;

public class Coaches {

    private final List<Coach> elements = new ArrayList<>();

    public void addCoach(Coach coach) {
        elements.add(coach);
    }

    public void recommendFood(Category category) {
        elements.forEach(element -> element.recommend(category));
    }
}