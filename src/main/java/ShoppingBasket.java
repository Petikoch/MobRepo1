import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private final Map<Article, Integer> shoppingBasketItems = new HashMap<>();

    public void addArticle(Article article, int quantity) {
        shoppingBasketItems.put(article, quantity);
    }

    public int getQuantityForArticle(Article article) {
        return 0;
    }
}
