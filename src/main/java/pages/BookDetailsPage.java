package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BookDetailsPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public BookDetailsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getBookDetailsText() {

        return driver.findElement(
                By.xpath("//div[@id='title-wrapper']//label[@id='userName-value']")
        ).getText();
    }
}