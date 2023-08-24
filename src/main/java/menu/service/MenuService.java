package menu.service;

import menu.constant.Category;
import menu.domain.CategoryRecommender;
import menu.domain.Coaches;

import java.util.List;

public class MenuService {

    private final Coaches coaches = new Coaches();
    private final CategoryRecommender categoryRecommender = new CategoryRecommender();

    public void addCoach(String name, List<String> excludedFoods) {
        coaches.addCoach(name, excludedFoods);
    }

    public List<Category> getRecommendCategory() {
        return categoryRecommender.getCategories();
    }

    public void recommendMenus() {
        List<Category> categories = getRecommendCategory();
        categories.forEach(this::recommend);
        System.out.println(coaches);
    }

    private void recommend(Category category) {
        coaches.getCoaches()
                .forEach(coach -> coach.recommendFoods(category));
    }
}