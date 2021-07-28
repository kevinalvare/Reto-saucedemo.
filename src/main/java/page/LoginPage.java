package page;

import org.openqa.selenium.By;

public class LoginPage  {
    private By usernameLocator = By.id("user-name");
    private By passwordLocator = By.id("password");
    private By buttonLoginLocator = By.id("login-button");
    private By imgLocator = By.className("bot_column");
    private String nameUser= "standard_user";
    private String password = "secret_sauce";

    public String getNameUser() {
        return nameUser;
    }

    public String getPassword() {
        return password;
    }

    public By getUsernameLocator() {
        return usernameLocator;
    }

    public By getPasswordLocator() {
        return passwordLocator;
    }

    public By getButtonLoginLocator() {
        return buttonLoginLocator;
    }

    public By getImgLocator() {
        return imgLocator;
    }



}
