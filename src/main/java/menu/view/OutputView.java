package menu.view;

import menu.constant.Day;
import menu.constant.OutputMessage;
import menu.domain.Coaches;
import menu.domain.Name;

public class OutputView {

    public void printStartService() {
        System.out.println(OutputMessage.START_RECOMMEND.getMessage());
    }

    public void printReadNameMessage() {
        System.out.println(OutputMessage.READ_COACH_NAME.getMessage());
    }

    public void printReadForbiddenFoodMessage(Name name) {
        System.out.printf(OutputMessage.READ_FORBIDDEN_FOOD.getMessage(), name.getValue());
        System.out.println();
    }

    public void printResult() {
        System.out.println(OutputMessage.RESULT_PRINT.getMessage());
    }

    public void printDay() {
        System.out.println(Day.getValues());
    }

    public void printRecommend(Coaches coaches) {
        System.out.println(coaches.getCoachesResult());
    }

    public void printExceptionMessage(String message) {
        System.out.println(message);
    }
}