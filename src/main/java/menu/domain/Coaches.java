package menu.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Coaches {

    private static final String NEW_LINE = "\n";
    private final List<Coach> coaches = new ArrayList<>();

    public void addCoach(String name, List<String> excludedFoods) {
        coaches.add(new Coach(name, excludedFoods));
    }

    public List<Coach> getCoaches() {
        return Collections.unmodifiableList(coaches);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        coaches.forEach(coach -> stringBuilder.append(coach.toString()).append(NEW_LINE));
        return stringBuilder.toString();
    }
}
