package menu.view;

import menu.constant.Days;
import menu.constant.OutputMessage;
import menu.constant.ResultElement;
import menu.domain.CategoryRecommender;

import java.util.Arrays;
import java.util.StringJoiner;

public class OutputView {

    public void printStartMessage() {
        System.out.println(OutputMessage.START_MESSAGE);
        printNewLine();
    }

    public void printNameMessage() {
        System.out.println(OutputMessage.COACH_NAME);
    }

    public void printExcludedFood(String name) {
        System.out.printf(OutputMessage.EXCLUDED_FOOD.toString(), name);

    }

    public void printDays() {
        StringJoiner stringJoiner = new StringJoiner(ResultElement.DELIMITER.toString(), ResultElement.START.toString(), ResultElement.END.toString());
        stringJoiner.add(OutputMessage.DAYS_TITLE.toString());
        Arrays.stream(Days.values())
                .forEach((day) -> stringJoiner.add(day.toString()));
        System.out.println(stringJoiner);
    }

    public void printCategory(CategoryRecommender categories) {
        System.out.println(categories);
    }

    private void printNewLine() {
        System.out.println();
    }
}
