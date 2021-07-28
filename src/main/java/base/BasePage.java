package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BasePage {
private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver chromeDriverConnection() {
        System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        return driver;

    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);

    }

    public List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }

    public String getText(WebElement element) {
        return element.getText();
    }

    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public void type(String inputText, By locator) {
        driver.findElement(locator).sendKeys(inputText);
    }

    public void click(By locator) throws Exception {
        try {
            driver.findElement(locator).click();
        }catch (Exception e){
            throw new Exception("No se pudo clickear sobre el elemento: " + locator);
        }

    }

    public void clear(By locator) throws Exception {

        try {
            driver.findElement(locator).clear();
        }catch (Exception e){
            throw new Exception("No se pudo borrar sobre el elemento: " + locator);
        }

    }

    public void submit(By locator) throws Exception {
        try {
            driver.findElement(locator);
        }catch (Exception e){
            throw new Exception("No se pudo dar enter sobre el elemento: " + locator);
        }

    }

    public Boolean isDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }

    }

    public void visit(String url){
        driver.get(url);
    }

}
