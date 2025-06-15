package TestPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.Base;
import Objects.Objects;
import Objects.Trips;

public class TestClass extends Base {
	
    Objects obj;
    TestClass test;
    Trips trip;
    @BeforeTest
	public void init() {
       
       super.getDriver().get("https://stage.app.vialumina.eu/#/login");
		
	}
    @Test
public void login() throws InterruptedException {
	obj= new Objects(driver);
	test=new TestClass();
	trip= new Trips(driver);
	Thread.sleep(5000);
	obj.enterUser("akash.mahale@vialumina.se");
	obj.enterPassword("Kibbcom12");
	obj.clickLoginButton();
	trip.clickTrip();
	//trip.ClickCheckBox();
}
}
