package menu.domain;

import java.util.ArrayList;
import java.util.List;

public class Coach {

    private final String name;
    private final List<String> excludedFoods;

    public Coach(String name, List<String> excludedFoods) {
        this.name = name;
        this.excludedFoods = new ArrayList<>(excludedFoods);
    }
}
