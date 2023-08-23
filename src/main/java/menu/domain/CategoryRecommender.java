package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;
import menu.constant.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryRecommender {

    private static final int MAX_RECOMMEND = 5;

    private final List<Category> categories;

    public CategoryRecommender() {
        this.categories = recommendCategory();
    }

    private List<Category> recommendCategory() {
        List<Category> categories = new ArrayList<>();
        for (int i = 0; i < MAX_RECOMMEND; i++) {
            categories.add(Category.getRecommendFood(Randoms.pickNumberInRange(1, 5)));
        }
        return categories;
    }

    public List<Category> getCategories() {
        return categories;
    }
}
