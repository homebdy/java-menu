package menu.controller;

import menu.view.InputView;
import menu.view.OutputView;

import java.util.List;

public class MenuController {

    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();

    public void start() {
        outputView.printStartMessage();
        outputView.printNameMessage();
        List<String> coaches = inputView.readNames();
        coaches.forEach(name -> {
            outputView.printExcludedFood(name);
            inputView.readExcludedFood();
        });
    }
}
