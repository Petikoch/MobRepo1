import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<Article, Integer> shoppingBasketItems = new HashMap<>();

    public void addArticle(Article article, int quantity) {
        shoppingBasketItems.put(article, quantity);
    }

    public BigDecimal getTotalPrice() {

    }
}
