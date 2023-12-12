package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;
import menu.constant.MenuConstant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Categories {

    private static final int MAX_COUNT = 2;

    private final List<Category> elements = new ArrayList<>();

    public Categories() {
        recommend();
    }

    private void recommend() {
        while (elements.size() < MenuConstant.RECOMMEND_COUNT.getValue()) {
            Category category = Category.getCategory(Randoms.pickNumberInRange(1, 3));
            if (isOverTreeTimes(category)) {
                continue;
            }
            elements.add(category);
        }
    }

    private boolean isOverTreeTimes(Category category) {
        int count = 0;
        for (Category element : elements) {
            if (category.equals(element)) {
                count++;
            }
        }
        return count >= MAX_COUNT;
    }

    public List<Category> getCategories() {
        return Collections.unmodifiableList(elements);
    }
}
