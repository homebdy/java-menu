package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;
import menu.constant.Category;
import menu.constant.Menu;

import java.util.*;

public class MenuRecommender {

    private static final int WINNING_NUMBER = 0;

    private final Map<Coach, List<String>> recommendResult;

    public MenuRecommender() {
        this.recommendResult = new HashMap<>();
    }

    public void recommendFoods(Coach coach, List<Category> categories) {
        System.out.println(categories);
        List<String> foods = new ArrayList<>();
        categories.forEach((category) -> foods.add(getRandomFood(coach, category, foods)));
        recommendResult.put(coach, foods);
    }

    private String getRandomFood(Coach coach, Category category, List<String> foods) {
        String menu = Randoms.shuffle(Menu.getFoodsByCategory(category)).get(WINNING_NUMBER);
        while (coach.isExcludedFood(menu) || isDuplicate(menu, foods)) {
            menu = Randoms.shuffle(Menu.getFoodsByCategory(category)).get(WINNING_NUMBER);
        }
        return menu;
    }

    private boolean isDuplicate(String menu, List<String> foods) {
        return foods.contains(menu);
    }
}
