package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RecommendMenu {

    private static final int RECOMMEND_NUMBER = 0;

    private final List<String> menus = new ArrayList<>();
    private final ExcludedMenu excludedMenu = new ExcludedMenu();

    public void addExcludedMenu(List<String> menu) {
        excludedMenu.addElements(menu);
    }

    public void recommend(Category category) {
        String menu = Randoms.shuffle(Menu.getMenuByCategory(category)).get(RECOMMEND_NUMBER);
        while (isDuplicate(menu) || isExcludedMenu(menu)) {
            menu = Randoms.shuffle(Menu.getMenuByCategory(category)).get(RECOMMEND_NUMBER);
        }
        menus.add(menu);
    }

    private boolean isDuplicate(String menu) {
        return menus.contains(menu);
    }

    private boolean isExcludedMenu(String menu) {
        return !excludedMenu.canEat(menu);
    }
}
