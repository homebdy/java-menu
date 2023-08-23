package menu.view;

import menu.constant.OutputMessage;

public class OutputView {

    public void printStartMessage() {
        System.out.println(OutputMessage.START_MESSAGE);
        printNewLine();
    }

    private void printNewLine() {
        System.out.println();
    }
}
