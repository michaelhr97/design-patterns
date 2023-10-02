package patterns.builder.advanced;

import java.math.BigDecimal;
import java.util.List;

public interface ArticleBuilder {
    interface Id {
        Reference id(int id);
    }

    interface Reference{
        RetailPrice reference(String reference);
    }

    interface  RetailPrice {
        Optionals retailPrice(BigDecimal retailPrice);
    }

    interface Optionals{
        Optionals phones(List<Long> phones);
        Optionals description(String description);
        Optionals stock(int stock);
        Optionals tags(List<String> tags);
        Optionals wholesalePrice(BigDecimal wholesalePrice);

        Article build();
    }
}
