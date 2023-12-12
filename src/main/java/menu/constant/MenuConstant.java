package menu.constant;

public enum MenuConstant {

    RECOMMEND_COUNT(5);

    private final int value;

    MenuConstant(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
