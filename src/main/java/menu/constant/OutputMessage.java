package menu.constant;

public enum OutputMessage {

    START_RECOMMEND("점심 메뉴 추천을 시작합니다."),
    READ_COACH_NAME("코치의 이름을 입력해 주세요. (, 로 구분)"),
    READ_FORBIDDEN_FOOD("%s(이)가 못 먹는 메뉴를 입력해 주세요."),
    DAY_START("구분"),
    RESULT_START("[ "),
    RESULT_END(" ]"),
    RESULT_DELIMITER(" | "),
    RESULT_PRINT("메뉴 추천 결과입니다."),
    NEW_LINE("\n");

    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    }