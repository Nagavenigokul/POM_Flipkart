package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class PlaceOrderPage extends TestBase {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
	By placeOrderButton= By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div[3]/div/form/button");
	
	public void ValidatePlaceOrder() {
		driver.findElement(placeOrderButton).click();

	}

}
