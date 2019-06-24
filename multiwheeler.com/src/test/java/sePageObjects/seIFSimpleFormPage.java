package sePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class seIFSimpleFormPage {

	WebDriver driver;
	
	By singleInputMB = By.id("user-message");
	By showMessageBtn = By.xpath("//*[@id='get-input']/button");
	
	public seIFSimpleFormPage(WebDriver driver) {
		this.driver=driver;
	}

	public void enterMessageAndShow(String msg){
		
		//driver.findElement(singleInputMB).clear();
		driver.findElement(singleInputMB).sendKeys(msg);
		driver.findElement(showMessageBtn).click();
		
	}
}
