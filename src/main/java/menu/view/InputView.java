package menu.view;

import camp.nextstep.edu.missionutils.Console;
import menu.domain.Name;
import menu.validator.InputValidator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    private final InputValidator validator = new InputValidator();

    public List<Name> readNames() {
        String input = Console.readLine();
        validator.validateDelimiter(input);
        return Arrays.stream(input.split(","))
                .map(Name::new)
                .collect(Collectors.toList());
    }
}