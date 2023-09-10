package menu.controller;

import menu.domain.Names;
import menu.view.InputView;
import menu.view.OutputView;

public class MenuController {

    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();

    public void start() {
        outputView.printStart();
        Names names = readNames();
    }

    private Names readNames() {
        outputView.printCoachNames();
        return inputView.readNames();
    }
}
