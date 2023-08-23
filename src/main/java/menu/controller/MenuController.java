package menu.controller;

import menu.view.OutputView;

public class MenuController {

    private final OutputView outputView = new OutputView();

    public void start() {
        outputView.printStartMessage();
        outputView.printNameMessage();
    }
}
