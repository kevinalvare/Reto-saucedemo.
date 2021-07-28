package page;


import org.openqa.selenium.By;


public class ProductsPage  {

    private By productsMessageLocator = By.className("title");


    public By getProductsMessageLocator() {
        return productsMessageLocator;
    }


}
