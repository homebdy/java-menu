package menu;

import menu.domain.ForbiddenFood;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class ForbiddenFoodTest {

    @DisplayName("금지 음식이 3개 이상일 경우 예외 발생")
    @Test
    void biggerThanMaxSize() {
        List<String> menus = List.of("라자냐", "스파게티", "규동");
        assertThatThrownBy(() -> new ForbiddenFood(menus))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("못먹는 음식에 포함된 음식이 입력될 경우 true 반환")
    @Test
    void containForbidden() {
        List<String> menus = List.of("라자냐", "스파게티");
        ForbiddenFood forbiddenFood = new ForbiddenFood(menus);
        String input = "라자냐";

        boolean isForbidden = forbiddenFood.isForbidden(input);

        assertThat(isForbidden).isTrue();
    }

    @DisplayName("못먹는 음식에 포함되지 않은 음식이 입력될 경우 false 반환")
    @Test
    void notContainForbidden() {
        List<String> menus = List.of("라자냐", "스파게티");
        ForbiddenFood forbiddenFood = new ForbiddenFood(menus);
        String input = "라면";

        boolean isForbidden = forbiddenFood.isForbidden(input);

        assertThat(isForbidden).isFalse();
    }
}
