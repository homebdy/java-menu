package menu.domain;

import menu.constant.OutputMessage;

import java.util.StringJoiner;

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

    public String getCoachResult() {
        OutputMessage start = OutputMessage.RESULT_START;
        OutputMessage end = OutputMessage.RESULT_END;
        OutputMessage delimiter = OutputMessage.RESULT_DELIMITER;
        StringJoiner stringJoiner = new StringJoiner(delimiter.getMessage(), start.getMessage(), end.getMessage());
        stringJoiner.add(name.getValue());
        stringJoiner.add(recommendFood.getRecommendResult());
        return stringJoiner.toString();
    }
}
