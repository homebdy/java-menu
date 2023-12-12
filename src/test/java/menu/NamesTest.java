package menu;

import menu.domain.Name;
import menu.domain.Names;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class NamesTest {

    @DisplayName("코치가 2명보다 적을 경우 예외 발생")
    @Test
    void smallerThanMinSize() {
        List<Name> names = List.of(new Name("포비"));
        assertThatThrownBy(() -> new Names(names))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("코치가 5명보다 많을 경우 예외 발생")
    @Test
    void biggerThanMaxSize() {
        Name name1 = new Name("포비일");
        Name name2 = new Name("포비이");
        Name name3 = new Name("포비삼");
        Name name4 = new Name("포비사");
        Name name5 = new Name("포비오");
        Name name6 = new Name("포비육");
        List<Name> names = List.of(name1, name2, name3, name4, name5, name6);

        assertThatThrownBy(() -> new Names(names))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
