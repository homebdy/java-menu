package menu.domain;

import menu.constant.ExceptionMessage;

import java.util.Arrays;

public enum Category {
    JAPANESE("일식", 1),
    KOREAN("한식", 2),
    CHINESE("중식", 3),
    ASIAN("아시안", 4),
    WESTERN("양식", 5);

    private final String value;
    private final int number;

    Category(String value, int number) {
        this.value = value;
        this.number = number;
    }

    public static Category getCategory(int number) {
        return Arrays.stream(Category.values())
                .filter(value -> value.number == number)
                .findAny()
                .orElseThrow(() -> new IllegalStateException(ExceptionMessage.INVALID_CATEGORY.getMessage()));
    }

    public String getValue() {
        return value;
    }
}
