package SeleniumCourseBootcampMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

 
public class Tooltip extends Base {

	public void matchTooltip() 
	{
		
		
		WebElement element = driver.findElement(By.partialLinkText("Instagram"));
		
		String expectedTooltip ="Check out Instagram";
		String actualTooltip =element.getAttribute("title");
		
		System.out.println("actual title is "+actualTooltip);
		
		if(actualTooltip.equals(expectedTooltip))
		{
			System.out.println("Test matched");
			
		}
		else
		{
			System.out.println("Test failed");
		} 
		
		driver.close();
	}
	public static void main(String[] args)
	{
		Tooltip obj1 = new Tooltip();
		obj1.setupBrowser("chrome", "https://wwww.facebook.com");
		obj1.matchTooltip();

	}

}
