package SeleniumCourseBootcampMaven;



import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3_Locators extends Base {


	
	public void Locators()
	{
		driver.findElement(By.id("email")).sendKeys("batman554466@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("password123");
		driver.findElement(By.name("login")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(
		//By.cssSelector("#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer > div > div > div")));
		String actualtext = driver.findElement(By.xpath("//*[@id='error_box']/div[2]")).getText();
		System.out.println(actualtext);
		String expectedtext = "The  email  address  that  you've  entered doesn't match any account. Sign up for an account";
		
		if ( actualtext.equals (expectedtext))
		{
			driver.quit();
		}
		else
		{
			System.out.println("actual text does not match with expected text");
		} 
			
		
	}
	public static void main(String[] args) {
		
		Assignment3_Locators obj = new Assignment3_Locators();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.Locators();
	}

}
