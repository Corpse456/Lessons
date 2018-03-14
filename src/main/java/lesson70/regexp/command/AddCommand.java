package lesson70.regexp.command;

import java.util.List;

public class AddCommand extends Command {

    private String string;

    AddCommand (List<String> strings, String string) {
        super(strings);
        this.string = string;
    }

    public void execute () {
        if (strings != null) {
            strings.add(string);
        }
    }
}
