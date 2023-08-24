package menu.service;

import menu.constant.Category;
import menu.domain.Categories;
import menu.domain.Coaches;
import menu.domain.Name;

import java.util.List;

public class MenuService {

    private final Coaches coaches = new Coaches();
    private final Categories categories = new Categories();

    public void addCoach(Name name, List<String> excludedFoods) {
        coaches.addCoach(name, excludedFoods);
    }


    public void recommendMenus() {
        categories.getCategories()
                .forEach(this::recommendMenuForCoaches);
    }

    private void recommendMenuForCoaches(Category category) {
        coaches.getCoaches()
                .forEach(coach -> coach.recommendFoods(category));
    }

    public Categories getCategories() {
        return categories;
    }

    public Coaches getCoaches() {
        return coaches;
    }
}
