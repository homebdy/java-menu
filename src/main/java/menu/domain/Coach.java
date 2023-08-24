package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;
import menu.constant.Category;
import menu.constant.Menu;
import menu.constant.ResultElement;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Coach {

    private static final int WINNING_NUMBER = 0;

    private final String name;
    private final List<String> excludedFoods;
    private final List<String> recommendFoods;

    public Coach(String name, List<String> excludedFoods) {
        this.name = name;
        this.excludedFoods = new ArrayList<>(excludedFoods);
        this.recommendFoods = new ArrayList<>();
    }

    public void recommendFoods(Category category) {
        recommendFoods.add(getRandomFood(category));
    }

    private String getRandomFood(Category category) {
        String menu = Randoms.shuffle(Menu.getFoodsByCategory(category)).get(WINNING_NUMBER);
        while (isExcludedFood(menu) || isDuplicateRecommend(menu)) {
            menu = Randoms.shuffle(Menu.getFoodsByCategory(category)).get(WINNING_NUMBER);
        }
        return menu;
    }

    private boolean isExcludedFood(String food) {
        return excludedFoods.contains(food);
    }

    private boolean isDuplicateRecommend(String food) {
        return recommendFoods.contains(food);
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(ResultElement.DELIMITER.toString(), ResultElement.START.toString(), ResultElement.END.toString());
        stringJoiner.add(name);
        recommendFoods.forEach(stringJoiner::add);
        return stringJoiner.toString();
    }
}
