package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static Common.Config.PLALFORM_AND_BROWSER;
import static constants.Constants.IMPLICIT_WAIT;

public class CommonActions {

    public static WebDriver createDriver() {
        WebDriver driver = null;

        switch (PLALFORM_AND_BROWSER) {
            case "macos_m1_chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/m1_chromedriver");
                driver = new ChromeDriver();
                break;
            case "macos_intel_chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/intel_chromedriver");
                driver = new ChromeDriver();
                break;
            case "aws_chrome":
                System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
                driver = new ChromeDriver();
                break;
            default:
                Assert.fail();
        }
/*        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);*/

        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("disable-gpu");
        driver = new ChromeDriver(options);
        return driver;
    }
}
