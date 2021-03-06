package test.laba.server.mycommands;

import test.laba.common.IO.Colors;
import test.laba.server.mycommands.commands.AbstractCommand;
import test.laba.common.responses.Response;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * history command
 */
public class History extends AbstractCommand {
    private Deque<String> history = new ArrayDeque<>();
    private Integer i = 0;
    private  final  int numberOfProducts = 10;
    public History() {
        super("History", "вывести последние 10 команд (без их аргументов)");
    }

    public  void addToHistory(String s) {
        history.add(s);
        i++;
        if (i > numberOfProducts) {
            history.pollFirst();
        }
    }

    /**
     * output the last 10 commands (without their arguments)
     * @return string with the last 10 commands (without their arguments)
     */
    public Response execute(String arg, Root root) {
        return new Response(Colors.BlUE +  "History: " + Colors.END + history);
    }
}
