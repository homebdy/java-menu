package menu.view;

import menu.constant.OutputMessage;

public class OutputView {

    public void printStartService() {
        System.out.println(OutputMessage.START_RECOMMEND.getMessage());
    }

    public void printReadNameMessage() {
        System.out.println(OutputMessage.READ_COACH_NAME.getMessage());
    }
}