package menu.controller;

import menu.service.MemberService;
import menu.service.MenuService;
import menu.view.InputView;
import menu.view.OutputView;

import java.util.List;

public class MenuController {

    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();
    private final MemberService memberService = new MemberService();
    private final MenuService menuService = new MenuService();

    public void start() {
        outputView.printStartMessage();
        outputView.printNameMessage();
        List<String> coaches = inputView.readNames();
        coaches.forEach(name -> {
            outputView.printExcludedFood(name);
            memberService.addCoach(name, inputView.readExcludedFood());
        });
        menuService.recommendCategory();
    }
}
