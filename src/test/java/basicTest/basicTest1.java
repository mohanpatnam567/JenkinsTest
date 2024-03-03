package basicTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class basicTest1 {
	@Test
	public void Test1() {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangecrm.com/");
		driver.manage().window().maximize();
		driver.getCurrentUrl();
		driver.close();
		
		
		
	}

}
