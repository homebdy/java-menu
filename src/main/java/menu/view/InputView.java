package menu.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class InputView {

    public List<String> readNames() {
        String input = Console.readLine();
        return List.of(input.split(","));
    }
}