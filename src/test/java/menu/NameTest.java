package menu;

import menu.domain.Name;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class NameTest {

    @DisplayName("이름 길이가 2보다 짧을 경우 예외 발생")
    @Test
    void shortThanMinLength() {
        String input = "p";
        assertThatThrownBy(() -> new Name(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("이름 길이가 4보다 짧을 경우 예외 발생")
    @Test
    void longerThanMaxLength() {
        String input = "abcde";
        assertThatThrownBy(() -> new Name(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("이름 길이가 2~5 사이일 경우 이름 생성")
    @Test
    void createName() {
        String input = "ab";
        assertThat(new Name(input).getValue()).isEqualTo(input);
    }
}
