package officeMart;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import officeMart.stepObject.CartSteps;
import officeMart.stepObject.HomePageSteps;
import officeMart.stepObject.InvoiceSteps;
import officeMart.utils.Retry;
import officeMart.utils.Runner;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static officeMart.dataObject.ContentData.*;

@Listeners
public class InvoiceTests extends Runner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N19. Company name field should became red - Negative test")
    public void companyNameErrorInput() {
        InvoiceSteps steps = new InvoiceSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        CartSteps cartSteps = new CartSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        cartSteps
                .goToCart()
                .goToContinue();
        steps
                .goToSend();
        Assert.assertTrue(steps.SendButton.isEnabled());
        steps
                .companyNameFieldShouldBeRed();
        //Assert.assertTrue(Color.CompanyNameInput.getCssValue(String.valueOf(red)));
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N20. Identification code field should became red - Negative test")
    public void personalIDErrorInput() {
        InvoiceSteps steps = new InvoiceSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        CartSteps cartSteps = new CartSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        cartSteps
                .goToCart()
                .goToContinue();
        steps
                .goToSend()
                .personalIDFieldShouldBeRed();
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N21. Actual address field should became red - Negative test")
    public void addressErrorInput() {
        InvoiceSteps steps = new InvoiceSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        CartSteps cartSteps = new CartSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        cartSteps
                .goToCart()
                .goToContinue();
        steps
                .goToSend()
                .actualAddressFieldShouldBeRed();
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N22. Contact number field should became red - Negative test")
    public void contactNumberErrorInput() {
        InvoiceSteps steps = new InvoiceSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        CartSteps cartSteps = new CartSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        cartSteps
                .goToCart()
                .goToContinue();
        steps
                .goToSend()
                .phoneNumberFieldShouldBeRed();
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N23. Order receive time field should became red - Negative test")
    public void orderReceiveTimeErrorInput() {
        InvoiceSteps steps = new InvoiceSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        CartSteps cartSteps = new CartSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        cartSteps
                .goToCart()
                .goToContinue();
        steps
                .goToSend()
                .orderReceiveTimeFieldShouldBeRed();
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N24. Email field should became red - Negative test")
    public void emailErrorInput() {
        InvoiceSteps steps = new InvoiceSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        CartSteps cartSteps = new CartSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        cartSteps
                .goToCart()
                .goToContinue();
        steps
                .goToSend()
                .emailFieldShouldBeRed();
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N25. Fill company name field - Positive test")
    public void fillCompanyNAmeInput() {
        InvoiceSteps steps = new InvoiceSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        CartSteps cartSteps = new CartSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        cartSteps
                .goToCart()
                .goToContinue();
        steps
                .goToSend()
                .companyNameFieldShouldBeRed()
                .fillCompanyName();
        Assert.assertEquals(steps.CompanyNameInput.getValue(),Company);
        steps
                .goToSend()
                .companyNameFieldShouldNotBeRed();
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N26. Letters are not allowed to identification code field - Negative test")
    public void lettersAreNotAllowedToIdentificationCodeInput() {
        InvoiceSteps steps = new InvoiceSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        CartSteps cartSteps = new CartSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        cartSteps
                .goToCart()
                .goToContinue();
        steps
                .fillLettersToIdentificationCodeInput();
        Assert.assertNotEquals(steps.IdentificationCodeInput.getValue(),Company);
        steps
                .identificationCodeInputIsEmpty();
        Assert.assertTrue(steps.IdentificationCodeInput.is(Condition.empty));
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N27. Identification code field should became red - Negative test")
    public void wrongPersonalID() {
        InvoiceSteps steps = new InvoiceSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        CartSteps cartSteps = new CartSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        cartSteps
                .goToCart()
                .goToContinue();
        steps
                .fillPersonalIDInputWithLessThen11Symbols();
        Assert.assertEquals(steps.IdentificationCodeInput.getValue(),IncorrectPersonalID);
        steps
                .goToSend()
                .personalIDFieldShouldBeRed();
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N28. Identification code field should became red - Negative test")
    public void anotherWrongPersonalID() {
        InvoiceSteps steps = new InvoiceSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        CartSteps cartSteps = new CartSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        cartSteps
                .goToCart()
                .goToContinue();
        steps
                .fillPersonalIDInputWith12Symbols();
        Assert.assertEquals(steps.IdentificationCodeInput.getValue(), CorrectPersonalID);
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N29. when filling identification code field with correct value, it should not be red anymore - Positive test")
    public void correctPersonalID() {
        InvoiceSteps steps = new InvoiceSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        CartSteps cartSteps = new CartSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        cartSteps
                .goToCart()
                .goToContinue();
        steps
                .goToSend()
                .personalIDFieldShouldBeRed()
                .fillPersonalIDInputWith11symbols();
        Assert.assertEquals(steps.IdentificationCodeInput.getValue(),CorrectPersonalID);
        steps
                .goToSend()
                .personalIDInputShouldNotBeRed();
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N30. after filling actual address field, input should not be red anymore - Positive test")
    public void fillActualAddressField() {
        InvoiceSteps steps = new InvoiceSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        CartSteps cartSteps = new CartSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        cartSteps
                .goToCart()
                .goToContinue();
        steps
                .goToSend()
                .actualAddressFieldShouldBeRed()
                .fillActualAddressFieldWithAnyKindOfValue();
        Assert.assertEquals(steps.ActualAddressInput.getValue(),ActualAddress);
        steps
                .goToSend()
                .actualAddressInputShouldNotBeRed();
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N31. letter are not allowed to phone number field- Negative test")
    public void lettersAreNotAllowedToContactNumberField() {
        InvoiceSteps steps = new InvoiceSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        CartSteps cartSteps = new CartSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        cartSteps
                .goToCart()
                .goToContinue();
        steps
                .goToSend()
                .fillPhoneNumberFieldWithLetters();
        Assert.assertNotEquals(steps.ContactNumberInput.getValue(),ActualAddress);
        steps
                .contactNumberFieldIsEmpty();
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N32. Fill phone number field with less then 9 symbols - Negative test")
    public void fillPhoneNumberFieldWithWrongValue() {
        InvoiceSteps steps = new InvoiceSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        CartSteps cartSteps = new CartSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        cartSteps
                .goToCart()
                .goToContinue();
        steps
                .goToSend()
                .fillPhoneNumberFieldWithLessThen9Symbols();
        Assert.assertEquals(steps.ContactNumberInput.getValue(),WrongPhoneNumber);
        steps
                .goToSend()
                .phoneNumberFieldShouldBeRed();
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N33. Fill phone number field with 12 symbols - Negative test")
    public void fillPhoneNumberFieldWithAnotherWrongValue() {
        InvoiceSteps steps = new InvoiceSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        CartSteps cartSteps = new CartSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        cartSteps
                .goToCart()
                .goToContinue();
        steps
                .goToSend()
                .fillPhoneNumberFieldWith12Symbols();
        Assert.assertEquals(steps.ContactNumberInput.getValue(), CorrectPhoneNumber);
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N34. after filling phone number field with 9 symbols, input should not be red anymore - Positive test")
    public void fillPhoneNumberField() {
        InvoiceSteps steps = new InvoiceSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        CartSteps cartSteps = new CartSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        cartSteps
                .goToCart()
                .goToContinue();
        steps
                .goToSend()
                .phoneNumberFieldShouldBeRed()
                .fillPhoneNumberFieldWith9Symbols();
        Assert.assertEquals(steps.ContactNumberInput.getValue(),CorrectPhoneNumber);
        steps
                .goToSend()
                .phoneNumberInputShouldNotBeRed();
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N35. Fill order receive time field with less then 5 symbols - Negative test")
    public void fillOrderReceiveTimeFieldWithWrongValue() {
        InvoiceSteps steps = new InvoiceSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        CartSteps cartSteps = new CartSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        cartSteps
                .goToCart()
                .goToContinue();
        steps
                .goToSend()
                .orderReceiveTimeFieldShouldBeRed()
                .fillOrderReceiveTimeFieldWithLessThen5Symbols();
        Assert.assertEquals(steps.OrderReceiveTimeInput.getValue(),WrongOrderReceiveTimeValue);
        steps
                .orderReceiveTimeFieldShouldBeRed();
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N36. fill order receive time field with more then 5 symbols - Positive test")
    public void fillOrderReceiveTimeWithCorrectValue() {
        InvoiceSteps steps = new InvoiceSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        CartSteps cartSteps = new CartSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        cartSteps
                .goToCart()
                .goToContinue();
        steps
                .goToSend()
                .orderReceiveTimeFieldShouldBeRed()
                .fillOrderReceiveTimeFieldWithMoreThen5Symbols();
        Assert.assertEquals(steps.OrderReceiveTimeInput.getValue(),CorrectOrderReceiveTimeValue);
        steps
                .goToSend()
                .orderReceiveTimeInputShouldNotBeRed();
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N37. fill email field with correct value - Positive test")
    public void fillEmailInputWithCorrectValue() {
        InvoiceSteps steps = new InvoiceSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        CartSteps cartSteps = new CartSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        cartSteps
                .goToCart()
                .goToContinue();
        steps
                .goToSend()
                .emailFieldShouldBeRed()
                .fillEmailFieldWithCorrectValue();
        Assert.assertEquals(steps.EmailInput.getValue(),CorrectEmailValue);
        steps
                .goToSend()
                .emailInputShouldNotBeRed();
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N38. fill email field with wrong value - Negative test")
    public void fillEmailInputWithWrongValue() {
        InvoiceSteps steps = new InvoiceSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        CartSteps cartSteps = new CartSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        cartSteps
                .goToCart()
                .goToContinue();
        steps
                .goToSend()
                .emailFieldShouldBeRed()
                .fillEmailFieldWithWrongValue();
        Assert.assertEquals(steps.EmailInput.getValue(),WrongEmailValue);
        steps
                .goToSend()
                .emailFieldShouldBeRed();
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N39. fill email field with another wrong value - Negative test")
    public void fillEmailInputWithAnotherWrongValue() {
        InvoiceSteps steps = new InvoiceSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        CartSteps cartSteps = new CartSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        cartSteps
                .goToCart()
                .goToContinue();
        steps
                .goToSend()
                .emailFieldShouldBeRed()
                .fillEmailFieldWithAnotherWrongValue();
        Assert.assertEquals(steps.EmailInput.getValue(),AnotherWrongEmailValue);
        steps
                .goToSend()
                .emailFieldShouldBeRed();
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("N40. fill email field with incorrect value - Negative test")
    public void fillEmailInputWithIncorrectValue() {
        InvoiceSteps steps = new InvoiceSteps();
        HomePageSteps homePageSteps = new HomePageSteps();
        CartSteps cartSteps = new CartSteps();
        homePageSteps
                .goToSearch()
                .searchProduct()
                .addToCart();
        cartSteps
                .goToCart()
                .goToContinue();
        steps
                .goToSend()
                .emailFieldShouldBeRed()
                .fillEmailFieldWithIncorrectValue();
        Assert.assertEquals(steps.EmailInput.getValue(),IncorrectEmailValue);
        steps
                .goToSend()
                .emailFieldShouldBeRed();
    }
}
