package menu.view;

import camp.nextstep.edu.missionutils.Console;
import menu.domain.Coaches;
import menu.domain.Name;
import menu.domain.Names;
import menu.validator.InputValidator;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputView {

    private static final String REGEX = ",";

    private final InputValidator inputValidator = new InputValidator();

    public Coaches readNames() {

        return attemptedInput(
                () -> {
                    String input = Console.readLine();
                    inputValidator.validateDelimiter(input);
                    List<Name> names = Stream.of(input.split(REGEX))
                            .map(Name::new)
                            .collect(Collectors.toList());
                    return new Coaches(new Names(names));
                }
        );
    }

    public List<String> readExcludedMenu() {
        return attemptedInput(
                () -> {
                    String input = Console.readLine();
                    inputValidator.validateDelimiter(input);
                    return Stream.of(input.split(REGEX))
                            .collect(Collectors.toList());
                }
        );
    }

    private <T> T attemptedInput(Supplier<T> supplier) {
        try {
            return supplier.get();
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            return supplier.get();
        }
    }
}
