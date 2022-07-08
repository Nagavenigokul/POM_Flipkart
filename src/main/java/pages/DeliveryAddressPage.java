package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class DeliveryAddressPage extends TestBase {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	
	By deliverAddLoc=By.xpath("//*[@id=\"CNTCT1E43D489212446BC895A06BA1\"]/button");
//	By mailIdloc=By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[3]/div/div/div/div/div[5]/span[1]/form/input");
	By continueButton=By.xpath("//*[@id=\"to-payment\"]/button");
	

	public void validateDeliveryAddress() {
		wait(5000);
		driver.findElement(deliverAddLoc).click();
		wait(5000);
				//WebElement mailId=driver.findElement(mailIdloc);
//				JavascriptExecutor jse = (JavascriptExecutor) driver;
//				jse.executeScript("arguments[0].scrollIntoView()", mailId);
//				wait(2000);
		//driver.findElement(mailIdloc).sendKeys("nagavenigokulnath@gmail.com");
		//wait(2000);
		driver.findElement(continueButton).click();
		wait(5000);
//		Alert alert =driver.switchTo().alert();
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		alert.accept();		
		
	}
	

}
