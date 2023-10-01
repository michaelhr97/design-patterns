package patterns;

import patterns.builder.simple.User;
import patterns.singleton.Console;

public class App {
    public static void main(String[] args) {
        Console.getInstance().writeln("Hello world");
        Console.getInstance().writeln("Bye world!");

        User user = User.builder("1", "Mickey", "Michael").build();
        Console.getInstance().writeln(user.toString());
    }
}
