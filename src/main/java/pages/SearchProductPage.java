package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import base.TestBase;

public class SearchProductPage extends TestBase{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
By srcLoc=By.className("_3704LK");
By okButtonLoc=By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button");

public boolean SearchProduct(String prodName) {
	driver.findElement(srcLoc).sendKeys(prodName);
	wait(2000);
	driver.findElement(okButtonLoc).click();
	
	
	//validating serachProductPage
	boolean flagResult=true;
	try {
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[1]/div/div/div[1]/div[3]/a")));
	                                                                 
	} catch(TimeoutException te) {
		captureScreenshot("Searchproduct Failure");
		flagResult = false;
}
	if(flagResult) {
		String actResult=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[1]/div/div/div[1]/div[3]/a")).getText();
		return actResult.equals("Mobiles");
	}
	else
	return false;
	
}
}
