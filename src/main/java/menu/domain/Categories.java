package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;
import menu.constant.Day;
import menu.constant.OutputMessage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class Categories {

    private static final int MAX_COUNT = 2;

    private final List<Category> elements = new ArrayList<>();

    public Categories() {
        recommend();
    }

    private void recommend() {
        while (elements.size() < Day.getCount()) {
            Category category = Category.getCategory(Randoms.pickNumberInRange(1, 5));
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

    public String getCategoriesResult() {
        OutputMessage start = OutputMessage.RESULT_START;
        OutputMessage end = OutputMessage.RESULT_END;
        OutputMessage delimiter = OutputMessage.RESULT_DELIMITER;
        StringJoiner stringJoiner = new StringJoiner(delimiter.getMessage(), start.getMessage(), end.getMessage());
        stringJoiner.add(OutputMessage.CATEGORY.getMessage());
        elements.forEach(element -> stringJoiner.add(element.getValue()));
        return stringJoiner.toString();
    }
}
