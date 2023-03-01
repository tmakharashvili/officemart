package officeMart;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import officeMart.stepObject.HomePageSteps;
import officeMart.utils.Retry;
import officeMart.utils.Runner;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static officeMart.dataObject.ContentData.IncorrectProduct;
import static officeMart.dataObject.ContentData.Product;

@Listeners
public class HomePageTests extends Runner {
    @Test (retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N1. By press Search button search input display- Positive test")
    public void searchInputDisplay() {
        HomePageSteps steps = new HomePageSteps();
        steps
                .goToSearch()
                .searchInputDisplay();
        Assert.assertTrue(steps.SearchButton.isEnabled());
        Assert.assertTrue(steps.SearchInput.isDisplayed());
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N2. Searching correct item - Positive test")
    public void searchCorrectItem(){
        HomePageSteps steps = new HomePageSteps();
        steps
                .goToSearch()
                .searchProduct();
      //  Assert.assertEquals(steps.SearchInput.getValue(),Product);
        steps
                .productNAmeDisplay();
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N3. Searching incorrect item - Negative test")
    public void searchInCorrectItem() {
        HomePageSteps steps = new HomePageSteps();
        steps
                .goToSearch()
                .searchIncorrectProduct()
                .noSearchResultWereFound();
        Assert.assertTrue(steps.NoSearchResultWereFound.isDisplayed());
    }
    @Test (retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N4. Searching product - Positive test")
    public void addProductToTheCart(){
        HomePageSteps steps = new HomePageSteps();
        steps
                .goToSearch()
                .searchProduct()
                .addToCart();
        Assert.assertTrue(steps.AddToCartButton.isEnabled());
        steps
                .productHasBeenSuccessfullyAddedToCart();
        Assert.assertTrue(steps.ProductHasBeenSuccessfullyAddedToCart.isDisplayed());
    }
}