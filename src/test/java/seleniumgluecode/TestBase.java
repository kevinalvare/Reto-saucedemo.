package seleniumgluecode;
import org.openqa.selenium.chrome.ChromeDriver;
import page.LoginPage;
import page.ProductsPage;

public class TestBase {
    protected ChromeDriver driver = Hooks.getDriver();
    protected LoginPage loginPage = new LoginPage();
    protected ProductsPage productsPage = new ProductsPage();


}
