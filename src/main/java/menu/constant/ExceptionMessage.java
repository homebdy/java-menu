package menu.constant;

public enum ExceptionMessage {

    INCORRECT_RECOMMEND("잘못된 추천입니다."),
    INCORRECT_CATEGORY("존재하지 않는 카테고리입니다.");

    private static final String PREFIX = "[ERROR] ";
    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return PREFIX + message;
    }
}