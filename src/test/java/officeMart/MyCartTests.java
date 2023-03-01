package officeMart;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import officeMart.stepObject.CartSteps;
import officeMart.stepObject.HomePageSteps;
import officeMart.utils.Retry;
import officeMart.utils.Runner;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners
public class MyCartTests extends Runner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N5. Product title should be visible - Positive test")
    public void productNAmeShouldBeVisible() {
        CartSteps steps = new CartSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        steps
                .goToCart()
                .titleShouldBeVisible();
        Assert.assertTrue(steps.MyCart.isEnabled());
        Assert.assertTrue((steps.ProductTitle.is(Condition.visible)));
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N6. Product color should be visible - Positive test")
    public void productColorShouldBeVisible() {
        CartSteps steps = new CartSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        steps
                .goToCart()
                .colorShouldBeVisible();
      //  Assert.assertTrue((steps.ProductColor.is(Condition.visible)));
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N7. Product ID should be visible - Positive test")
    public void productIDShouldBeVisible() {
        CartSteps steps = new CartSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        steps
                .goToCart()
                .iDShouldBeVisible();
        Assert.assertTrue((steps.ProductID.is(Condition.visible)));
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N8. Product quantity should be visible - Positive test")
    public void productQuantityShouldBeVisible() {
        CartSteps steps = new CartSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        steps
                .goToCart()
                .quantityShouldBeVisible();
        Assert.assertTrue((steps.ProductQuantity.is(Condition.visible)));
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N9. Product price should be visible - Positive test")
    public void productPriceShouldBeVisible() {
        CartSteps steps = new CartSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        steps
                .goToCart()
                .priceShouldBeVisible();
        Assert.assertTrue((steps.ProductPrice.is(Condition.visible)));
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N10. Total price should be visible - Positive test")
    public void sumShouldBeVisible() {
        CartSteps steps = new CartSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        steps
                .goToCart()
                .totalPriceShouldBeVisible();
        Assert.assertTrue((steps.TotalPrice.is(Condition.visible)));
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N11. Increase item quantity and total price - Positive test")
    public void sumIncreases() {
        CartSteps steps = new CartSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        steps
                .goToCart()
                .increaseQuantity()
                .sumIncreases();
        Assert.assertFalse(steps.IncreaseQuantity.is(Condition.disabled));
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N12. Decrease item quantity and total price  - Positive test")
    public void sumDecreases() {
        CartSteps steps = new CartSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        steps
                .goToCart()
                .decreaseQuantity()
                .sumDecreases();
        Assert.assertFalse(steps.DecreaseQuantity.is(Condition.disabled));
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N13. Delete item by the button 'X' - Positive test")
    public void deleteItem() {
        CartSteps steps = new CartSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        steps
                .goToCart()
                .deleteItem();
        Assert.assertTrue(steps.DeleteItem.isEnabled());
        steps
                .productDisappear();
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N14. clear from the cart several products - Positive test")
    public void clearTheCart() {
        CartSteps steps = new CartSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        homePageSteps
                .goToSearch();
        steps
                .addSeveralItemsToTheCart()
                .clearTheCart()
                .productsDisappears();
      //  Assert.assertTrue(steps.ClearTheCartButton.isEnabled());
        Assert.assertFalse((steps.ProductTitle.is(Condition.visible)));
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N15. The cart is empty displayed - Positive test")
    public void cartIsEmptyDisplayed() {
        CartSteps steps = new CartSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        homePageSteps
                .goToSearch();
        steps
                .addSeveralItemsToTheCart()
                .clearTheCart()
                .cartIsEmptyDisplayed();
        Assert.assertTrue((steps.CartIsEmpty.is(Condition.visible)));
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N16. Continue button disappears - Positive test")
    public void continueButtonDisappears() {
        CartSteps steps = new CartSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        homePageSteps
                .goToSearch();
        steps
                .addSeveralItemsToTheCart()
                .clearTheCart()
                .continueButtonDisappears();
        Assert.assertFalse(steps.ContinueButton.isDisplayed());
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N17. Clear the cart button disappears - Positive test")
    public void clearTheCartButtonDisappears() {
        CartSteps steps = new CartSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        homePageSteps
                .goToSearch();
        steps
                .addSeveralItemsToTheCart()
                .clearTheCart()
                .clearTheCartButtonDisappears();
        Assert.assertFalse(steps.ClearTheCartButton.exists());
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N18. by press continue button appears two form: Legal Entity and Physical Person - Positive test")
    public void toPressContinueButtonAppears2Form() {
        CartSteps steps = new CartSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        steps
                .goToCart()
                .goToContinue();
        Assert.assertTrue(steps.ContinueButton.isEnabled());
        steps
                .twoFormAppears();
        Assert.assertTrue(steps.LegalEntityForm.isDisplayed());
        Assert.assertTrue(steps.PhysicalPerson.isDisplayed());
    }
}
