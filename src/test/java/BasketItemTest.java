import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketItemTest {

    @Test
    void getQuantityForArticleTest() {
        ShoppingBasket basket = new ShoppingBasket();
        Article article = new Article(UUID.randomUUID(), "Gugus", BigDecimal.TEN);
        basket.addArticle(article, 1);

        int quantityForArticle = basket.getQuantityForArticle(article);

        assertEquals(1, quantityForArticle);
    }
}
