package axa.tests;

import axa.pages.HomePage;
import axa.utils.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomepageTest extends TestBase{

    @Test
    public void simpleHomepageTest() throws InterruptedException {

        WebDriver driver = firingWebDriver.get();

        HomePage hp = new HomePage(driver);
        hp.loadPage(driver);
        hp.clickCalculator();

        Thread.sleep(5000);
    }
}
