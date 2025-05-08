import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class BasketItemTest {

    @Test
    void addArticleTest() {
        ShoppingBasket basket = new ShoppingBasket();
        Article article = new Article();

        basket.addArticle(article, 1);

        assertEquals(BigDecimal.ZERO, basket.getPrice());
    }
}
