package menu.controller;

import menu.domain.ForbiddenFood;
import menu.domain.Name;
import menu.domain.Names;
import menu.service.MenuService;
import menu.view.InputView;
import menu.view.OutputView;

public class MenuController {

    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();
    private final MenuService menuService = new MenuService();

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
                .forEach(this::addCoach);
    }

    private void addCoach(Name name) {
        outputView.printReadForbiddenFoodMessage(name);
        ForbiddenFood forbiddenFood = inputView.readForbiddenFood();
        menuService.addCoach(name, forbiddenFood);
    }
}
