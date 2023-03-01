package officeMart.stepObject;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import officeMart.pageObject.CartPage;
import java.time.Duration;
import static officeMart.dataObject.ContentData.*;

public class CartSteps extends CartPage {
    @Step("go to cart")
    public CartSteps goToCart() {
        MyCart.click();
        return this;
    }
    @Step("product title should be visible")
    public CartSteps titleShouldBeVisible() {
        ProductTitle.shouldBe(Condition.visible, Duration.ofMillis(3000));
        return this;
    }
    @Step("product color should be visible")
    public CartSteps colorShouldBeVisible() {
        ProductColor.shouldBe(Condition.visible, Duration.ofMillis(3000));
        return this;
    }
    @Step("product ID should be visible")
    public CartSteps iDShouldBeVisible() {
        ProductID.shouldBe(Condition.visible, Duration.ofMillis(3000));
        return this;
    }
    @Step("product quantity should be visible")
    public CartSteps quantityShouldBeVisible() {
        ProductQuantity.shouldBe(Condition.visible, Duration.ofMillis(3000));
        return this;
    }
    @Step("product price should be visible")
    public CartSteps priceShouldBeVisible() {
        ProductPrice.shouldBe(Condition.visible, Duration.ofMillis(3000));
        return this;
    }
    @Step("total price should be visible")
    public CartSteps totalPriceShouldBeVisible() {
        TotalPrice.shouldBe(Condition.visible, Duration.ofMillis(3000));
        return this;
    }
    @Step("increase item quantity")
    public CartSteps increaseQuantity(){
        IncreaseQuantity.click();
        return this;
    }
    @Step("total price should increase")
    public CartSteps sumIncreases(){
        TotalPrice.shouldBe(Condition.interactable, Duration.ofMillis(3000));
        return this;
    }
    @Step("decrease item quantity")
    public CartSteps decreaseQuantity() {
        DecreaseQuantity.click();
        return this;
    }
    @Step("total price should decrease")
    public CartSteps sumDecreases() {
        TotalPrice.shouldBe(Condition.interactable, Duration.ofMillis(3000));
        return this;
    }
    @Step("delete item by the button 'X' ")
    public CartSteps deleteItem(){
        DeleteItem.click();
        return this;
    }
    @Step("product disappear from the cart")
    public CartSteps productDisappear(){
        ProductTitle.shouldBe(Condition.disappear);
        return this;
    }
    @Step("add several items to the cart")
    public CartSteps addSeveralItemsToTheCart(){
        HomePageSteps homePageSteps = new HomePageSteps();
        homePageSteps
                .SearchInput.setValue(Binder).pressEnter();
        AddToCartItem1.click();
        AddToCartItem2.click();
        AddToCartItem3.click();
        return this;
    }
    @Step("clear the cart")
    public CartSteps clearTheCart(){
        GoToTheCart.click();
        ClearTheCartButton.click();
        return this;
    }
    @Step("all products disappear")
    public CartSteps productsDisappears(){
        ProductTitle.shouldBe(Condition.disappear);
        return this;
    }
    @Step("cart is empty displayed")
    public CartSteps cartIsEmptyDisplayed(){
        CartIsEmpty.isDisplayed();
        return this;
    }
    @Step("continue button disappears")
    public CartSteps continueButtonDisappears(){
        ContinueButton.shouldBe(Condition.disappear,Duration.ofMillis(1000));
        return this;
    }
    @Step("clear the cart button disappears")
    public CartSteps clearTheCartButtonDisappears(){
        ClearTheCartButton.shouldBe(Condition.disappear,Duration.ofMillis(1000));
        return this;
    }
    @Step("go to continue")
    public CartSteps goToContinue(){
        ContinueButton.click();
        return this;
    }
    @Step("appears two form: Legal Entity and Physical Person")
    public CartSteps twoFormAppears() {
        LegalEntityForm.shouldBe(Condition.visible,Duration.ofMillis(3000));
        PhysicalPerson.shouldBe(Condition.visible,Duration.ofMillis(3000));
        return this;
    }
}

