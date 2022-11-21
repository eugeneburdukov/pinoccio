package tests.base;

import Common.CommonActions;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.Home;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected Home home = new Home(driver);
}
