package lesson70.regexp.command;

import java.util.List;

public class AddHelloButton {

    private Command command;

    public AddHelloButton (List<String> strings, String string) {
        command = new AddCommand(strings, string);
    }

    public AddHelloButton (List<String> strings) {

    }

    public Command getCommand () {
        return command;
    }

    public void setCommand (Command command) {
        this.command = command;
    }

    public void click () {

    }
}
