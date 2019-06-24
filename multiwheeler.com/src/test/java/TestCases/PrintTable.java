package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PrintTable {
public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumaro\\Documents\\ChromeDriver\\ChromeDriver.exe");
	  	//ChromeOptions option = new ChromeOptions();
	  	

		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.toolsqa.com/automation-practice-table/");
		
		//System.out.println(driver.findElement(By.cssSelector(".tsc_table_s13")).getText());
		
		List<WebElement> rowList=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/*//tr"));
		List<WebElement> headList=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead/tr/th"));
		int colN=0;
		for(WebElement we:headList){
			
			if((we.getText()).equals("Rank")){
				break;
				
				
			}
			colN++;
		}
		System.out.println("Rank col found is "+colN);
		
		List<WebElement> totalRow=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
		int i=1;
		for(WebElement we: totalRow){
			
			System.out.println(driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]"+"/td["+colN+"]")).getText());
			i++;
		}
		
		int rowNum = rowList.size();
		List<WebElement> colList=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/*//td"));
		System.out.println("-------------"+colList.size());
		for(WebElement we : colList){
			//System.out.println(we.getText());
			
		}
		
		
	}




}
