package menu.controller;

import menu.view.InputView;
import menu.view.OutputView;

public class MenuController {

    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();

    public void start() {
        outputView.printStartMessage();
        outputView.printNameMessage();
        inputView.readNames();
    }
}
