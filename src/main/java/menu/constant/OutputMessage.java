package menu.constant;

public enum OutputMessage {

    START_MESSAGE("점심 메뉴 추천을 시작합니다."),
    COACH_NAME("코치의 이름을 입력해 주세요. (, 로 구분)");

    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return this.message;
    }
}