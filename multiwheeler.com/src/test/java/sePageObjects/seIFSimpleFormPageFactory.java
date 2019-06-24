package sePageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class seIFSimpleFormPageFactory {

	WebDriver driver;
	
	@FindBy(how=How.ID,using= "user-message")
	@CacheLookup
	WebElement singleInputMB;
	
	@FindBy(how=How.XPATH,using= "//*[@id='get-input']/button")
	@CacheLookup
	WebElement showMessageBtn;
	
	@FindBy(how=How.XPATH,using ="//*[@id='get-input']/button")
	@CacheLookup
	WebElement showM1essageBtn;

	public void seIFSimpleFormPage(WebDriver driver) {
		this.driver=driver;
	}

	public void enterMessageAndShow(String msg){
		singleInputMB.clear();
		singleInputMB.sendKeys("Onkar");
		showMessageBtn.click();
		
		
		
	}
}
