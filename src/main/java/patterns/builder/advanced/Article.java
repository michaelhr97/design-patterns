package patterns.builder.advanced;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Article {

    private int id;

    private List<Long> phones = new ArrayList<>();

    private String reference;

    private String description;

    private BigDecimal retailPrice;

    private int stock;

    private List<String> tags;

    private BigDecimal wholesalePrice;

    public Article() {}

    public long getId() {
        return id;
    }

    public List<Long> getPhones() {
        return phones;
    }

    public void addPhone(long phone) {
        phones.add(phone);
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public BigDecimal getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(BigDecimal wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public static ArticleBuilder.Id builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Article [id=" + id + ", reference=" + reference + ", retailPrice=" + retailPrice + ", description=" + description
                + ", phones=" + phones + ", stock=" + stock + ", tags=" + tags + ", wholesalePrice=" + wholesalePrice + "]";
    }

    public static class Builder implements ArticleBuilder.Id, ArticleBuilder.Reference,
    ArticleBuilder.RetailPrice, ArticleBuilder.Optionals {

        private final Article article;

        public Builder() {
            this.article = new Article();
        }
        @Override
        public ArticleBuilder.Reference id(int id) {
            this.article.id = id;
            return this;
        }

        @Override
        public ArticleBuilder.RetailPrice reference(String reference) {
            this.article.reference = reference;
            return this;
        }

        @Override
        public ArticleBuilder.Optionals retailPrice(BigDecimal retailPrice) {
            this.article.retailPrice = retailPrice;
            return this;
        }

        @Override
        public ArticleBuilder.Optionals phones(List<Long> phones) {
            this.article.phones = phones;
            return this;
        }

        @Override
        public ArticleBuilder.Optionals description(String description) {
           this.article.description = description;
           return this;
        }

        @Override
        public ArticleBuilder.Optionals stock(int stock) {
            this.article.stock = stock;
            return this;
        }

        @Override
        public ArticleBuilder.Optionals tags(List<String> tags) {
            this.article.tags = tags;
            return this;
        }

        @Override
        public ArticleBuilder.Optionals wholesalePrice(BigDecimal wholesalePrice) {
            this.article.wholesalePrice = wholesalePrice;
            return this;
        }

        public Article build() {
            return this.article;
        }
    }

}