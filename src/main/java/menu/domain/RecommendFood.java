package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RecommendFood {

    private final List<String> elements = new ArrayList<>();

    public void recommend(Category category) {
        Menu menu = Menu.getMenu(category);
        elements.add(Randoms.shuffle(menu.getFoods()).get(0));
    }
}
