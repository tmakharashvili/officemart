package officeMart.stepObject;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import officeMart.pageObject.HomePage;
import java.time.Duration;
import static officeMart.dataObject.ContentData.*;

public class HomePageSteps extends HomePage {
    @Step("click on search button")
    public HomePageSteps goToSearch() {
        SearchButton.click();
        return this;
    }
    @Step("search input display")
    public HomePageSteps searchInputDisplay() {
        SearchInput.isDisplayed();
        return this;
    }
    @Step("Search item")
    public HomePageSteps searchProduct() {
        SearchInput.setValue(Product).pressEnter();
        ProductName.scrollIntoView(false);
        return this;
    }
    @Step("product appears")
    public HomePageSteps productNAmeDisplay() {
        ProductName.isDisplayed();
        return this;
    }
    @Step("Search incorrect item")
    public HomePageSteps searchIncorrectProduct() {
        SearchInput.setValue(IncorrectProduct).pressEnter();
        return this;
    }
    @Step("Search result not found")
    public HomePageSteps noSearchResultWereFound() {
        NoSearchResultWereFound.isDisplayed();
        return this;
    }
    @Step("Choose and add the item in cart")
    public HomePageSteps addToCart() {
        AddToCartButton.click();
        return this;
    }
    @Step("item has been successfully added to the cart")
    public HomePageSteps productHasBeenSuccessfullyAddedToCart() {
        ProductHasBeenSuccessfullyAddedToCart.shouldBe(Condition.visible, Duration.ofMillis(1000));
        return this;
    }
}
