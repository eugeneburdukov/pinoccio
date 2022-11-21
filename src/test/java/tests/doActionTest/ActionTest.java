package tests.doActionTest;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class ActionTest extends BaseTest {

    @Test(description = "Open Browser")
    public void doCheckState() {
        basePage.open("https://chromedriver.storage.googleapis.com/index.html?path=107.0.5304.62/");
    }
}
