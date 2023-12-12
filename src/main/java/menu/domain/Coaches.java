package menu.domain;

import menu.constant.OutputMessage;

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

    public String getCoachesResult() {
        StringBuilder sb = new StringBuilder();
        elements.forEach(element -> sb.append(element.getCoachResult()).append(OutputMessage.NEW_LINE.getMessage()));
        return sb.toString();
    }
}