package officeMart.pageObject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    public SelenideElement
        SearchButton = $(".waves-light"),
        SearchInput = $(byName("search")),
        AddToCartButton = $(byXpath("/html/body/div[5]/div[2]/div/div[21]/div[3]/div[2]/div[2]")),
        ProductHasBeenSuccessfullyAddedToCart = $(".toast"),
        NoSearchResultWereFound = $(".color_text"),
        ProductName = $(byXpath("/html/body/div[5]/div[2]/div/div[23]/div[3]/div[1]/a/h4"));
}
