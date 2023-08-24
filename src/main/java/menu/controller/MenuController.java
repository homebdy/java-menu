package menu.controller;

import menu.domain.Name;
import menu.service.MenuService;
import menu.view.InputView;
import menu.view.OutputView;

import java.util.List;

public class MenuController {

    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();
    private final MenuService menuService = new MenuService();

    public void start() {
        outputView.printStartMessage();
        outputView.printNameMessage();
        List<Name> coaches = inputView.readNames();
        outputView.printNewLine();
        coaches.forEach(name -> {
            outputView.printExcludedFood(name.toString());
            menuService.addCoach(name, inputView.readExcludedFood());
            outputView.printNewLine();
        });
        menuService.recommendMenus();
        outputView.printResult(menuService.getCategories(), menuService.getCoaches());
    }
}
