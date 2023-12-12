package menu.constant;

import java.util.Arrays;
import java.util.StringJoiner;

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

    public static String getValues() {
        OutputMessage start = OutputMessage.RESULT_START;
        OutputMessage end = OutputMessage.RESULT_END;
        OutputMessage delimiter = OutputMessage.RESULT_DELIMITER;
        StringJoiner stringJoiner = new StringJoiner(delimiter.getMessage(), start.getMessage(), end.getMessage());
        stringJoiner.add(OutputMessage.DAY_START.getMessage());
        Arrays.stream(Day.values())
                .forEach((d) -> stringJoiner.add(d.value));
        return stringJoiner.toString();
    }
}
