package menu.view;

import camp.nextstep.edu.missionutils.Console;
import menu.domain.ForbiddenFood;
import menu.domain.Name;
import menu.domain.Names;
import menu.validator.InputValidator;

import java.util.Arrays;
import java.util.stream.Collectors;

public class InputView {

    private final InputValidator validator = new InputValidator();

    public Names readNames() {
        String input = Console.readLine();
        validator.validateDelimiter(input);
        return new Names(Arrays.stream(input.split(","))
                .map(Name::new)
                .collect(Collectors.toList()));
    }

    public ForbiddenFood readForbiddenFood() {
        String input = Console.readLine();
        validator.validateDelimiter(input);
        return new ForbiddenFood(Arrays.stream(input.split(","))
                .collect(Collectors.toList()));
    }
}