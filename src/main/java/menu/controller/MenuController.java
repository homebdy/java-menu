package menu.controller;

import menu.domain.Names;
import menu.view.InputView;
import menu.view.OutputView;

public class MenuController {

    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();

    public void start() {
        outputView.printStartService();
        Names name = readNames();
    }

    private Names readNames() {
        outputView.printReadNameMessage();
        return inputView.readNames();
    }
}
