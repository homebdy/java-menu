package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

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
}
