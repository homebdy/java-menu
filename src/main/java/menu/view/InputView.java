package menu.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputView {

    public List<String> readNames() {
        String names = Console.readLine();
        return Stream.of(names.split(","))
                .collect(Collectors.toList());
    }
}
