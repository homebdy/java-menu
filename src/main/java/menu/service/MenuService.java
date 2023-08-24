package menu.service;

import menu.constant.Category;
import menu.domain.CategoryRecommender;
import menu.domain.Coaches;
import menu.domain.MenuRecommender;

import java.util.List;

public class MenuService {

    private final Coaches coaches = new Coaches();
    private final CategoryRecommender categoryRecommender = new CategoryRecommender();
    private final MenuRecommender menuRecommender = new MenuRecommender();

    public void addCoach(String name, List<String> excludedFoods) {
        coaches.addCoach(name, excludedFoods);
    }

    public List<Category> getRecommendCategory() {
        return categoryRecommender.getCategories();
    }

    public void recommendMenus() {
        coaches.getCoaches()
                .forEach(coach -> menuRecommender.recommendFoods(coach, getRecommendCategory()));

    }
}
