package patterns;

import patterns.builder.advanced.Article;
import patterns.builder.simple.User;
import patterns.singleton.Console;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        Console.getInstance().writeln("Hello world");
        Console.getInstance().writeln("Bye world!");

        User user = User.builder("1", "Mickey", "Michael").build();
        Console.getInstance().writeln(user.toString());

        Article article = Article.builder().id(323).reference("hello").retailPrice(BigDecimal.valueOf(123.456789)).build();
        Console.getInstance().writeln(article.toString());
    }
}
