package automationTestingExam;

import objectRepo.CommonFunctions;
import objectRepo.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class ValueFromDropDown extends CommonFunctions {

    WebDriver driver = null;
    HomePage homePage = null;

    @BeforeClass
    public void launch() {
        driver = launchBrowser();
        homePage = new HomePage(driver);
    }


}
