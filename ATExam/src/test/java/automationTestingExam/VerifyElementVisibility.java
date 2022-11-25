package automationTestingExam;

import objectRepo.CommonFunctions;
import objectRepo.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class VerifyElementVisibility extends CommonFunctions {

    WebDriver driver = null;
    HomePage homePage = null;

    @BeforeClass
    public void browserLaunch() {
        driver = launchBrowser();
        homePage = new HomePage(driver);
        System.out.println("BeforeClass annotation executed at the beginning.");

    }

    @BeforeMethod
    public void navigate() {
        click(homePage.getBestSellerButton());
        System.out.println("BeforeMethod annotation executed before Test annotation.");
    }

    @Test()
    public void isBuyNowDisplayed() {
        System.out.println("Test annotation is executed.");
        click(homePage.getFirstItem());
        boolean result = isDisplay(homePage.getBuyNowButton());
        if (result) {
            System.out.println("Buy Now button is visible.");
        } else {
            System.out.println("Buy Now button is not visible.");
        }
    }

    @AfterMethod
    public void returnToHome() {
        click(homePage.getHomeButton());
        System.out.println("AfterMethod annotation executed after every Test annotation.");

    }

    @AfterClass
    public void closeTab() {
        driver.close();
        System.out.println("AfterClass annotation executed after every Test annotation present in the class is executed.");
    }

    @AfterSuite
    public void quitBrowser() {
        driver.quit();
        System.out.println("AfterSuite annotation executed once TestSuite is executed.");
    }

}






/*
@Test(dependsOnMethods = "isBuyNowDisplayed")
    public void isProceedToBuyDisplayed() {
        click(homePage.getAddToCart());
        boolean result = isDisplay(homePage.getProceedToBuy());
        if(result) {
            Reporter.log("Proceed To Buy button is visible.");
        } else {
            Reporter.log("Proceed To Buy button is not visible.");
        }
    }
 */
