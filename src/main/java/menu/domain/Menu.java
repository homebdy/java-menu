package menu.domain;

import menu.constant.ExceptionMessage;

import java.util.Arrays;
import java.util.List;

public enum Menu {

    JAPANESE(Category.JAPANESE, List.of("규동", "우동")),
    KOREAN(Category.KOREAN, List.of("김밥", "김치찌개", "쌈밥", "된장찌개", "비빔밥", "칼국수", "불고기", "떡볶이", "제육볶음")),
    CHINESE(Category.CHINESE, List.of("깐풍기", "볶음면", "동파육", "짜장면", "짬뽕", "마파두부", "탕수육", "토마토 달걀볶음", "고추잡채")),
    ASIAN(Category.ASIAN, List.of("팟타이", "카오 팟", "나시고렝", "파인애플 볶음밥", "쌀국수", "똠얌꿍", "반미", "월남쌈", "분짜")),
    WESTERN(Category.WESTERN, List.of("라자냐", "그라탱", "뇨끼", "끼슈", "프렌치 토스트", "바게트", "스파게티", "피자", "파니니"));

    private final Category category;
    private final List<String> foods;

    Menu(Category category, List<String> foods) {
        this.category = category;
        this.foods = foods;
    }

    public static Menu getMenu(Category category) {
        return Arrays.stream(Menu.values())
                .filter(value -> value.category.equals(category))
                .findAny()
                .orElseThrow(() -> new IllegalStateException(ExceptionMessage.INVALID_MENU.getMessage()));
    }

    public List<String> getFoods() {
        return this.foods;
    }
}