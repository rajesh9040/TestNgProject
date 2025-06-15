package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Trips {
	
	WebDriver driver;
	
	public Trips(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//div[@class='nav_list w-100 mb-auto']//descendant::span[contains(text(),'Trips')]") WebElement tripsLink;
	@FindBy(xpath="//td[contains(text(),'Trip 20618')]//ancestor::tr/descendant::span[@class='e-frame e-icons']") WebElement CountTrip;
	
	
	public void clickTrip() {
		tripsLink.click();
	}
	
	public void ClickCheckBox() {
		
		CountTrip.click();
	}

}
