package SeleniumCourseBootcampMaven;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment6_HandlingWebUIElements extends Base {
	
	public void switchtabs()
	{ 
		System.out.println("*****current website is facebook*********");
		System.out.println("Current window tab handled is "+ driver.getWindowHandle());
		System.out.println("Total number of windows opened are "+ driver.getWindowHandles());
		
		driver.findElement(By.partialLinkText("Instagram")).click();
		System.out.println("*****current website is still facebook as the switch is not performed *********");
		System.out.println("Current window tab handled is "+ driver.getWindowHandle());
		System.out.println("Total number of windows opened are "+ driver.getWindowHandles());
	
//switching the focus to Instagram tab .here using the Array list to get the index (1) tab which is Instagram
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		System.out.println("***** After switch current website is Instagram *********");
		System.out.println("Current window tab handled is "+ driver.getWindowHandle());
		System.out.println("Total number of windows opened are "+ driver.getWindowHandles());
		
		System.out.println("page title - " + driver.getTitle());
	//Explicitly waiting for the tab to load
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='loginForm']/div/div[1]/div/label/input")));
	//Entering username abc@gmail.com and password as "password123"
		driver.findElement(By.xpath("//*[@id='loginForm']/div/div[1]/div/label/input")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//*[@id='loginForm']/div/div[2]/div/label/input")).sendKeys("password123");
		
	//closing all the browser tabs	
		driver.quit();
		System.out.println("All tabs closed and Test executed successfully");
	}

	public static void main(String[] args) {
		Assignment6_HandlingWebUIElements obj = new Assignment6_HandlingWebUIElements();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.switchtabs();
	}

}
