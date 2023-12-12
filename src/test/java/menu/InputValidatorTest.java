package menu;

import menu.validator.InputValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class InputValidatorTest {

    private final InputValidator validator = new InputValidator();

    @DisplayName("콤마 이외의 문자가 있을 경우 예외 발생")
    @Test
    void notCommaException() {
        String input = "po|pi";
        assertThatThrownBy(() -> validator.validateDelimiter(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("공백이 존재할 경우 예외 발생")
    @Test
    void spaceException() {
        String input = "po, pi";

        assertThatThrownBy(() -> validator.validateDelimiter(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
