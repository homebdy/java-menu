package menu.view;

import menu.constant.OutputMessage;

public class OutputView {

    public void printStart() {
        System.out.println(OutputMessage.START_RECOMMEND.getMessage());
        printNewLine();
    }

    public void printCoachNames() {
        System.out.println(OutputMessage.READ_NAMES.getMessage());
    }

    public void printNewLine() {
        System.out.println();
    }
}
