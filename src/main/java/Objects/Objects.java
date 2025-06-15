
package Objects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Objects {
    WebDriver driver;
    WebDriverWait wait;

    public Objects(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(10)); // Wait for up to 10 seconds
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='app2-mfe']//descendant::input[@name='email']")
    WebElement username;

    @FindBy(xpath = "//div[@id='app2-mfe']//descendant::input[@name='password']")
    WebElement password;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement continueBtn;

    public void enterUser(String user) {
        wait.until(ExpectedConditions.visibilityOf(username));
        username.sendKeys(user);
    }

    public void enterPassword(String code) {
        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys(code);
    }

    public void clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
        continueBtn.click();
    }
}
