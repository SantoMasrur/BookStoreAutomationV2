package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private By searchBox = By.id("searchBox");
    private By bookLink = By.xpath("//a[text()='Git Pocket Guide']");

    public void searchBook(String bookName) {

        WebElement search =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(searchBox)
                );

        search.clear();
        search.sendKeys(bookName);
    }

    public String getBookName() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(bookLink)
        ).getText();
    }

    public void openBook() {

        wait.until(
                ExpectedConditions.elementToBeClickable(bookLink)
        ).click();
    }
}