package menu.controller;

import menu.view.InputView;
import menu.view.OutputView;

import java.util.List;

public class MenuController {

    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();

    public void start() {
        outputView.printStart();
        readNames();
    }

    private void readNames() {
        outputView.printCoachNames();
        List<String> names = inputView.readNames();
    }
}
