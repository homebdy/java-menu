package menu.view;

import menu.constant.OutputMessage;
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

    public void printExceptionMessage(String message) {
        System.out.println(message);
    }
}