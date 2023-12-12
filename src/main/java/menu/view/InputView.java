package menu.view;

import camp.nextstep.edu.missionutils.Console;
import menu.validator.InputValidator;

import java.util.List;

public class InputView {

    private final InputValidator validator = new InputValidator();

    public List<String> readNames() {
        String input = Console.readLine();
        validator.validateDelimiter(input);
        return List.of(input.split(","));
    }
}