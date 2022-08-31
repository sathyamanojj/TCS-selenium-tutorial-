package SeleniumCourseBootcampMaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment4_waits {

	static WebDriver driver;

	public static void main(String args[]) {
		
		/*/
		 READ ME  !!! READ ME  !!!!  READ ME !!!!!!!READ ME !!!!!!!! 
		* Shopclues.come website is updated so as per the assignment password field is not there in the current website
		*  so unable to write the syntax for password and login
		*
		*/

		String fs = System.getProperty("file.separator");
		String currDir = System.getProperty("user.dir");
		String path = currDir + fs + "drivers" + fs;

		System.setProperty("webdriver.chrome.driver", path + "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.shopclues.com/"); 

		// Explicit wait - to wait for the "Retrieve Password" button to be click-able
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[3]/div[1]/button[1]")));

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[1]/button[1]")).click();

		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("main_user_login")).sendKeys("abc@gmail.com");
		
		System.out.println("Test executed successfully");
		
		driver.quit();
		/*/
		 READ ME  !!! READ ME  !!!!  READ ME !!!!!!!READ ME !!!!!!!! 
		* Shopclues.come website is updated so password field is not there in the current website
		*  so unable to write the syntax for password and login
		*
		*/
		
		 

	}
}