package menu.constant;

import java.util.Arrays;

public enum Day {
    MONDAY("월요일"),
    TUESDAY("화요일"),
    WEDNESDAY("수요일"),
    THURSDAY("목요일"),
    FRIDAY("금요일");

    private final String value;

    Day(String value) {
        this.value = value;
    }

    public static int getCount() {
        return (int) Arrays.stream(Day.values()).count();
    }
}
