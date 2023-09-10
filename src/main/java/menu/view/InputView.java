package menu.view;

import camp.nextstep.edu.missionutils.Console;
import menu.domain.Name;
import menu.validator.InputValidator;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputView {

    private final InputValidator inputValidator = new InputValidator();

    public List<Name> readNames() {
        String names = Console.readLine();
        inputValidator.validateDelimiter(names);
        return Stream.of(names.split(","))
                .map(Name::new)
                .collect(Collectors.toList());
    }
}
