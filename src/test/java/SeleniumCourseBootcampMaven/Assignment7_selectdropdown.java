package SeleniumCourseBootcampMaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment7_selectdropdown extends Base{

	public void dropdown() throws InterruptedException 
	{
		WebElement Countrycode = driver.findElement(By.id("countryCode"));
		WebElement Regionname = driver.findElement(By.id("regionName"));
	 	WebElement Cityname = driver.findElement(By.id("cityName"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div[2]/div/div/div[8]/div[1]/div[1]"));
		//Scroll the web page till the web element is found
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		Select Country_dropdown = new Select(Countrycode);
	     Country_dropdown.selectByVisibleText(" Australia");
		System.out.println(" Australia was selected successfully");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		Select Region_dropdown = new Select(Regionname);
		Region_dropdown.selectByVisibleText("Western Australia");
		Thread.sleep(3000);
		System.out.println("Western Australia was selected successfully");
		
		
		Select City_dropdown = new Select(Cityname);
		City_dropdown.selectByValue("Perth");  
		System.out.println(" Perth was selected successfully");
		driver.quit();
		
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		Assignment7_selectdropdown obj = new Assignment7_selectdropdown();
		obj.setupBrowser("chrome"," https://www.geodatasource.com/software/world-major-cities-drop-down-list-source-codes");
		
        driver.manage().window().maximize();
        obj.dropdown();
        
	}

}
