package menu.controller;

import menu.domain.Coach;
import menu.domain.ForbiddenFood;
import menu.domain.Name;
import menu.domain.Names;
import menu.view.InputView;
import menu.view.OutputView;

public class MenuController {

    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();

    public void start() {
        outputView.printStartService();
        Names names = readNames();
        readForbiddenFood(names);
    }

    private Names readNames() {
        outputView.printReadNameMessage();
        return inputView.readNames();
    }

    private void readForbiddenFood(Names names) {
        names.getElements()
                .forEach(this::readForbiddenFooddForEachCoach);
    }

    private Coach readForbiddenFooddForEachCoach(Name name) {
        outputView.printReadForbiddenFoodMessage(name);
        ForbiddenFood food = inputView.readForbiddenFood();
        return new Coach(name, food);
    }
}
