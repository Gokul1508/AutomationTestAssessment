package automationTestingExam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertPageTitle {

    WebDriver driver = null;

    @Test
    public void launch() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        String title = driver.getTitle();
        Assert.assertEquals(title, "Swag Labs");
    }
}
