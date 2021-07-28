package seleniumgluecode;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    private static ChromeDriver driver;


    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(" https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
       // driver.quit();
    }

    public static ChromeDriver getDriver() {
        return driver;
    }
}
