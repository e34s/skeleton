package axa.tests;

import axa.utils.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest extends TestBase{

    @Test
    public void simpleTest() {

        WebDriver driver = firingWebDriver.get();
        driver.get("https://www.axa.ch");
        Assert.assertEquals(driver.getTitle(), "Private customers");
        driver.quit();
    }
}
