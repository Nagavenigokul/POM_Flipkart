package pages;

import java.time.Duration;


import org.openqa.selenium.By;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class AddToCartPage extends TestBase {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

	By addCartLoc = By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button");
	// JavascriptExecutor jse=(JavascriptExecutor) driver;

	public boolean ValidateAddToCart() {
		driver.findElement(addCartLoc).click();


		boolean flagResult = true;
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[1]/div[1]/div/div[1]")));
		} catch (TimeoutException te) {
			captureScreenshot("AddToCart Failure");
			flagResult = false;
		}
		if(flagResult) {
			String actResult=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div[1]/div[2]/div/div[2]/div/button")).getText();
			return actResult.equals("Change");
		}else
			
		return false;
	}
}
