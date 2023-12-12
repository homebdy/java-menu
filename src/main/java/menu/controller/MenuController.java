package menu.controller;

import menu.domain.ForbiddenFood;
import menu.domain.Name;
import menu.domain.Names;
import menu.service.MenuService;
import menu.view.InputView;
import menu.view.OutputView;

import java.util.function.Supplier;

public class MenuController {

    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();
    private final MenuService menuService = new MenuService();

    public void start() {
        outputView.printStartService();
        addCoach(readNames());
        menuService.recommend();
        printRecommendResult();
    }

    private Names readNames() {
        return attemptedRead(() -> {
            outputView.printReadNameMessage();
            return inputView.readNames();
        });
    }

    private void addCoach(Names names) {
        names.getElements()
                .forEach(name -> menuService.addCoach(name, readForbiddenFoodForEachCoach(name)));
    }

    private ForbiddenFood readForbiddenFoodForEachCoach(Name name) {
        return attemptedRead(() -> {
            outputView.printReadForbiddenFoodMessage(name);
            ForbiddenFood forbiddenFood = inputView.readForbiddenFood();
            return forbiddenFood;
        });

    }

    private void printRecommendResult() {
        outputView.printResult();
        outputView.printDay();
        outputView.printCategories(menuService.getCategories());
        outputView.printRecommend(menuService.getCoaches());
        outputView.printComplete();
    }
    private <T> T attemptedRead(Supplier<T> supplier) {
        try {
            return supplier.get();
        } catch (IllegalArgumentException exception) {
            outputView.printExceptionMessage(exception.getMessage());
            return supplier.get();
        }
    }
}
