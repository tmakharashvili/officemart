package officeMart.pageObject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class InvoicePage {
    public SelenideElement
    SendButton = $("#btn2"),
    CompanyNameInput = $(byName("name")),
    IdentificationCodeInput = $(".iur-code"),
    ActualAddressInput = $(byXpath("//*[@id=\"form2\"]/div[3]/input")),
    ContactNumberInput = $(".iur-phone"),
    OrderReceiveTimeInput = $(".iur_date"),
    EmailInput = $(byXpath("//*[@id=\"form2\"]/div[7]/input"));
}
