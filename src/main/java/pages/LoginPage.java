package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By userName = By.id("userName");
    private By password = By.id("password");
    private By loginBtn = By.id("login");

    public void login(String user, String pass) {

        driver.findElement(userName)
                .sendKeys(user);

        driver.findElement(password)
                .sendKeys(pass);

        driver.findElement(loginBtn)
                .click();
    }
}