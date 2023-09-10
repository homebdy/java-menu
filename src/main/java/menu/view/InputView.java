package menu.view;

import camp.nextstep.edu.missionutils.Console;
import menu.validator.InputValidator;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputView {

    private final InputValidator inputValidator = new InputValidator();

    public List<String> readNames() {
        String names = Console.readLine();
        inputValidator.validateDelimiter(names);
        return Stream.of(names.split(","))
                .collect(Collectors.toList());
    }
}
