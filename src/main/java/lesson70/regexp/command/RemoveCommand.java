package lesson70.regexp.command;

import java.util.List;

public class RemoveCommand extends Command {

    public RemoveCommand (List<String> strings) {
        super(strings);
    }

    @Override
    public void execute () {
        strings.remove(strings.size() - 1);
    }
}
