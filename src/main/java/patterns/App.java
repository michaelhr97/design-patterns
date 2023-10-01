package patterns;

import patterns.singleton.Console;

public class App {
    public static void main(String[] args) {
        Console.getInstance().writeln("Hello world");
        Console.getInstance().write("Bye world!");
    }
}
