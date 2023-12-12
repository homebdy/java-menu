package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;
import menu.constant.OutputMessage;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class RecommendFood {

    private final List<String> elements;
    private final ForbiddenFood forbiddenFood;

    public RecommendFood(ForbiddenFood forbiddenFood) {
        elements = new ArrayList<>();
        this.forbiddenFood = forbiddenFood;
    }

    public void recommend(Category category) {
        Menu menu = Menu.getMenu(category);
        while (true) {
            String random = Randoms.shuffle(menu.getFoods()).get(0);
            if (isNotDuplicate(random) && !forbiddenFood.isForbidden(random)) {
                elements.add(random);
                break;
            }
        }
    }

    private boolean isNotDuplicate(String menu) {
        return !elements.contains(menu);
    }

    public String getRecommendResult() {
        OutputMessage delimiter = OutputMessage.RESULT_DELIMITER;
        StringJoiner stringJoiner = new StringJoiner(delimiter.getMessage());
        elements.forEach(stringJoiner::add);
        return stringJoiner.toString();
    }
}
