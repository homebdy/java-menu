package menu.service;

import menu.domain.Coaches;

import java.util.List;

public class MemberService {

    private final Coaches coaches = new Coaches();

    public void addCoach(String name, List<String> excludedFoods) {
        coaches.addCoach(name, excludedFoods);
    }
}
