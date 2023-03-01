package officeMart.utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.aspectj.lang.annotation.AfterThrowing;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Runner {
    @BeforeTest(description = "Configure browser before tests")
    public static void setUp (){
        Configuration.browser="chrome";
        Configuration.browserSize="1440x900";
        Selenide.open("https://officemart.ge/ge");
    }
    @AfterTest(description = "close window after tests")
    public static void tearDown(){
        /* Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow(); */
        Selenide.closeWebDriver();
    }
}
