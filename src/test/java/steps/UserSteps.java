package steps;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.WebElement;
import seleniumgluecode.TestBase;


import static org.junit.Assert.assertEquals;

public class UserSteps extends TestBase {



    @Cuando("Un usuario ingresa ussername y password valido")
    public void unUsuarioIngresaUssernameYPasswordValido() {
        driver.findElement(loginPage.getUsernameLocator()).sendKeys(loginPage.getNameUser());
        driver.findElement(loginPage.getPasswordLocator()).sendKeys(loginPage.getPassword());
        driver.findElement(loginPage.getButtonLoginLocator()).click();
    }

    @Entonces("Ingresa a la pagina de productos")
    public void ingresaALaPaginaDeProductos() {
        WebElement productsLocator = driver.findElement(productsPage.getProductsMessageLocator());
        assertEquals(productsLocator.getText(),"PRODUCTS");
    }
}
