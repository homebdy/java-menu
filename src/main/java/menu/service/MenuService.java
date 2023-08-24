package menu.service;

import menu.constant.Category;
import menu.domain.CategoryRecommender;
import menu.domain.Coaches;
import menu.domain.Name;

import java.util.List;

public class MenuService {

    private final Coaches coaches = new Coaches();
    private final CategoryRecommender categoryRecommender = new CategoryRecommender();

    public void addCoach(Name name, List<String> excludedFoods) {
        coaches.addCoach(name, excludedFoods);
    }


    public void recommendMenus() {
        List<Category> categories = getRecommendCategory();
        categories.forEach(this::recommendMenuForCoaches);
    }

    private List<Category> getRecommendCategory() {
        return categoryRecommender.getCategories();
    }

    private void recommendMenuForCoaches(Category category) {
        coaches.getCoaches()
                .forEach(coach -> coach.recommendFoods(category));
    }

    public CategoryRecommender getCategories() {
        return categoryRecommender;
    }

    public Coaches getCoaches() {
        return coaches;
    }
}
