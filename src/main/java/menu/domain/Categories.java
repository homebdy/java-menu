package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Categories {

    private final List<Category> elements;

    public Categories() {
        this.elements = recommendCategory();
    }

    private List<Category> recommendCategory() {
        List<Category> categories = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            categories.add(Category.getRecommendFood(Randoms.pickNumberInRange(1, 5)));
        }
        return categories;
    }
}
