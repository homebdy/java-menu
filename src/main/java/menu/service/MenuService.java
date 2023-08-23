package menu.service;

import menu.domain.CategoryRecommender;

public class MenuService {

    CategoryRecommender categoryRecommender = new CategoryRecommender();

    public void recommendCategory() {
        System.out.println(categoryRecommender.getCategories());
    }
}
