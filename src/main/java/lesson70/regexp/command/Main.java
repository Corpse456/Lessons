package lesson70.regexp.command;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("ab");
        strings.add("cd");

        new AddHelloButton(strings).click();
        System.out.println(strings);
    }
}
