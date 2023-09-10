package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Categories {

    private static final int RECOMMEND_COUNT = 5;
    private static final int MAX_RECOMMEND_COUNT = 2;
    private static final int START_RANDOM_NUMBER = 1;
    private static final int END_RANDOM_NUMBER = 5;

    private final List<Category> elements;

    public Categories() {
        this.elements = recommendCategory();
        System.out.print(elements);
    }

    private List<Category> recommendCategory() {
        List<Category> categories = new ArrayList<>();
        while (categories.size() < RECOMMEND_COUNT) {
            Category category = randomRecommend();
            if (isDuplicateRecommend(categories, category)) {
                continue;
            }
            categories.add(category);
        }
        return categories;
    }

    private Category randomRecommend() {
        int random = Randoms.pickNumberInRange(START_RANDOM_NUMBER, END_RANDOM_NUMBER);
        return Category.getRecommendFood(random);
    }

    private boolean isDuplicateRecommend(List<Category> categories, Category recommendCategory) {
        return categories.stream()
                .filter(category -> category == recommendCategory)
                .count() >= MAX_RECOMMEND_COUNT;
    }
}
