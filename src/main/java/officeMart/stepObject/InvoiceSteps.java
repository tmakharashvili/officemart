package officeMart.stepObject;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import officeMart.pageObject.InvoicePage;
import static java.awt.Color.red;
import static officeMart.dataObject.ContentData.*;

public class InvoiceSteps extends InvoicePage {
    @Step("press send button")
    public InvoiceSteps goToSend() {
        SendButton.click();
        return this;
    }
    @Step("company name field should be red")
    public InvoiceSteps companyNameFieldShouldBeRed() {
        CompanyNameInput.getCssValue(String.valueOf(red));
        return this;
    }
    @Step("identification code field should be red")
    public InvoiceSteps personalIDFieldShouldBeRed() {
        IdentificationCodeInput.getCssValue(String.valueOf(red));
        return this;
    }
    @Step("address field should be red")
    public InvoiceSteps actualAddressFieldShouldBeRed() {
        ActualAddressInput.getCssValue(String.valueOf(red));
        return this;
    }
    @Step("contact number field should be red")
    public InvoiceSteps phoneNumberFieldShouldBeRed() {
        ContactNumberInput.getCssValue(String.valueOf(red));
        return this;
    }
    @Step("order receive time field should be red")
    public InvoiceSteps orderReceiveTimeFieldShouldBeRed() {
        OrderReceiveTimeInput.getCssValue(String.valueOf(red));
        return this;
    }
    @Step("email field should be red")
    public InvoiceSteps emailFieldShouldBeRed() {
        EmailInput.getCssValue(String.valueOf(red));
        return this;
    }
    @Step("fill company name")
    public InvoiceSteps fillCompanyName() {
        CompanyNameInput.setValue(Company);
        return this;
    }
    @Step("company name input is not red anymore")
    public InvoiceSteps companyNameFieldShouldNotBeRed() {
        CompanyNameInput.shouldNotBe(Condition.attribute(String.valueOf(red)));
        return this;
    }
    @Step("fill incorrect value to identification code input")
    public InvoiceSteps fillLettersToIdentificationCodeInput() {
        IdentificationCodeInput.setValue(Company);
        return this;
    }
    @Step("is not allowed letters in identification code input")
    public InvoiceSteps identificationCodeInputIsEmpty() {
        IdentificationCodeInput.is(Condition.empty);
        return this;
    }
    @Step("fill personal ID input with incorrect value and go to send")
    public InvoiceSteps fillPersonalIDInputWithLessThen11Symbols() {
        IdentificationCodeInput.setValue(IncorrectPersonalID);
        return this;
    }
    @Step("fill personal ID input with incorrect value")
    public InvoiceSteps fillPersonalIDInputWith12Symbols() {
        IdentificationCodeInput.setValue(WrongPersonalID);
        return this;
    }
    @Step("fill personal ID field with correct value and go to send")
    public InvoiceSteps fillPersonalIDInputWith11symbols() {
        IdentificationCodeInput.setValue(CorrectPersonalID);
        return this;
    }
    @Step("personal ID field should not be red anymore")
    public InvoiceSteps personalIDInputShouldNotBeRed() {
        IdentificationCodeInput.shouldNotBe(Condition.attribute(String.valueOf(red)));
        return this;
    }
    @Step("fill actual address field and go to send")
    public InvoiceSteps fillActualAddressFieldWithAnyKindOfValue() {
        ActualAddressInput.setValue(ActualAddress);
        return this;
    }
    @Step("actual address field should not be red anymore")
    public InvoiceSteps actualAddressInputShouldNotBeRed() {
        ActualAddressInput.shouldNotBe(Condition.attribute(String.valueOf(red)));
        return this;
    }
    @Step("fill phone number field with letters")
    public InvoiceSteps fillPhoneNumberFieldWithLetters() {
        ContactNumberInput.setValue(ActualAddress);
        return this;
    }
    @Step("letters are not allowed to phone number field")
    public InvoiceSteps contactNumberFieldIsEmpty() {
        ContactNumberInput.is(Condition.empty);
        return this;
    }
    @Step("fill phone number field with wrong value")
    public InvoiceSteps fillPhoneNumberFieldWithLessThen9Symbols() {
        ContactNumberInput.setValue(WrongPhoneNumber);
        return this;
    }
    @Step("fill phone number field with another wrong value")
    public InvoiceSteps fillPhoneNumberFieldWith12Symbols() {
        ContactNumberInput.setValue(AnotherWrongPhoneNumber);
        return this;
    }
    @Step("fill phone number field 9 symbols value")
    public InvoiceSteps fillPhoneNumberFieldWith9Symbols() {
        ContactNumberInput.setValue(CorrectPhoneNumber);
        return this;
    }
    @Step("phone number field should not be red anymore")
    public InvoiceSteps phoneNumberInputShouldNotBeRed() {
        ContactNumberInput.shouldNotBe(Condition.attribute(String.valueOf(red)));
        return this;
    }
    @Step("fill order receive field with less then 5 symbols")
    public InvoiceSteps fillOrderReceiveTimeFieldWithLessThen5Symbols() {
        OrderReceiveTimeInput.setValue(WrongOrderReceiveTimeValue);
        return this;
    }
    @Step("fill order receive time field with more then 5 symbols")
    public InvoiceSteps fillOrderReceiveTimeFieldWithMoreThen5Symbols(){
        OrderReceiveTimeInput.setValue(CorrectOrderReceiveTimeValue);
        return this;
    }
    @Step("order receive time field should not be red anymore")
    public InvoiceSteps orderReceiveTimeInputShouldNotBeRed() {
        OrderReceiveTimeInput.shouldNotBe(Condition.attribute(String.valueOf(red)));
        return this;
    }
    @Step("fill email field with correct value")
    public InvoiceSteps fillEmailFieldWithCorrectValue(){
        EmailInput.setValue(CorrectEmailValue);
        return this;
    }
    @Step("email field should not be red anymore")
    public InvoiceSteps emailInputShouldNotBeRed(){
        EmailInput.shouldNotBe(Condition.attribute(String.valueOf(red)));
        return this;
    }
    @Step("fill email field with wrong value")
    public InvoiceSteps fillEmailFieldWithWrongValue(){
        EmailInput.setValue(WrongEmailValue);
        return this;
    }
    @Step("fill email field with another wrong value")
    public InvoiceSteps fillEmailFieldWithAnotherWrongValue(){
        EmailInput.setValue(AnotherWrongEmailValue);
        return this;
    }
    @Step("fill email field with incorrect value")
    public InvoiceSteps fillEmailFieldWithIncorrectValue(){
        EmailInput.setValue(IncorrectEmailValue);
        return this;
    }
}
