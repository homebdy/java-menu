package menu.view;

import camp.nextstep.edu.missionutils.Console;
import menu.domain.Name;
import menu.validator.InputValidator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputView {

    InputValidator inputValidator = new InputValidator();

    public List<Name> readNames() {
        String names = Console.readLine();
        inputValidator.validateDelimiter(names);
        return Arrays.stream(names.split(","))
                .map(Name::new)
                .collect(Collectors.toList());

    }

    public List<String> readExcludedFood() {
        String foods = Console.readLine();
        inputValidator.validateDelimiter(foods);
        return Stream.of(foods.split(","))
                .collect(Collectors.toList());
    }
}
