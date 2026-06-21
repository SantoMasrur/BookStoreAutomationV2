package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BookDetailsPage;
import pages.HomePage;

import java.time.Duration;

public class SearchBookTest extends BaseTest {

    @Test
    public void verifyBookSearchAndDetails() {

        driver.get("https://demoqa.com/books");

        HomePage homePage =
                new HomePage(driver);

        homePage.searchBook("Git Pocket Guide");

        Assert.assertEquals(
                homePage.getBookName(),
                "Git Pocket Guide");

        homePage.openBook();

        WebDriverWait wait =
                new WebDriverWait(driver,
                        Duration.ofSeconds(10));

        wait.until(
                ExpectedConditions.urlContains("books")
        );

        BookDetailsPage detailsPage =
                new BookDetailsPage(driver);

        Assert.assertTrue(
                detailsPage.getBookDetailsText()
                        .contains("Git Pocket Guide")
        );
    }
}