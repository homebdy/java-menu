package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RecommendMenu {

    private static final int RECOMMEND_NUMBER = 0;

    private final List<String> menus = new ArrayList<>();

    public void recommendMenu(Category category) {
        String recommendMenu = Randoms.shuffle(Menu.getMenuByCategory(category)).get(RECOMMEND_NUMBER);
        menus.add(recommendMenu);
        System.out.print(menus);
    }
}
