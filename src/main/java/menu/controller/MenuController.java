package menu.controller;

import menu.domain.Coaches;
import menu.view.InputView;
import menu.view.OutputView;

public class MenuController {

    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();

    public void start() {
        outputView.printStart();
        Coaches coaches = readNames();
    }

    private Coaches readNames() {
        outputView.printCoachNames();
        return inputView.readNames();
    }
}
