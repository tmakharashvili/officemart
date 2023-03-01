package officeMart.pageObject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    public SelenideElement
    MyCart = $(".cart_info"),
    ProductTitle = $(".item_title"),
    ProductColor = $(byXpath("/html/body/div[5]/div/div[3]/div[3]")),
    ProductID = $(".item_id"),
    ProductQuantity = $(byName("quantity")),
    ProductPrice = $(byXpath("/html/body/div[5]/div/div[3]/div[6]/div[2]/span[1]")),
    TotalPrice = $(".fullPriceFor"),
    IncreaseQuantity = $(".fa-plus"),
    DecreaseQuantity = $(".fa-minus"),
    DeleteItem = $(".fa-times"),
    Production = $(byLinkText("https://officemart.ge/category")),
    AddToCartItem1 = $(byXpath("/html/body/div[5]/div[2]/div/div[1]/div[3]/div[2]/div[2]/a")),
    AddToCartItem2 = $(byXpath("/html/body/div[5]/div[2]/div/div[2]/div[3]/div[2]/div[2]/a")),
    AddToCartItem3 = $(byXpath("/html/body/div[5]/div[2]/div/div[3]/div[3]/div[2]/div[2]/a")),
    GoToTheCart = $(".cart_info"),
    ClearTheCartButton = $(byText("კალათის გასუფთავება")),
    CartIsEmpty = $(byText("კალათა ცარიელია")),
    ContinueButton = $(".continue"),
    LegalEntityForm = $(byText("იურიდიული პირი")),
    PhysicalPerson = $(byText("ფიზიკური პირი"));
}
