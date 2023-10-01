package patterns.singleton;

public class Console {

    private static final Console instance = new Console();

    public static Console getInstance() {
        return instance;
    }

    public void write(String message) {
        System.out.print(message);
    }

    public void writeln(String message) {
        System.out.println(message);
    }
}
