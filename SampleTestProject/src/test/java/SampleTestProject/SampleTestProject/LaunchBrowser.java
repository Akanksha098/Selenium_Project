package SampleTestProject.SampleTestProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser 
{
	public static void main(String[] args)
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akanksha.Srivastava\\eclipse-workspace\\SampleTestProject\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://192.168.6.55/ADDMZAuthentication/PHMHome.aspx");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String Title= driver.getTitle();
		System.out.println(Title);
		
		WebElement element= driver.findElement(By.name("txtLogin"));
		element.sendKeys("HealthECCM");
		
		
		WebElement element1= driver.findElement(By.name("txtPwd"));
		element1.sendKeys("Password@123");
		
		WebElement submit= driver.findElement(By.name("buttonlogin"));
		submit.click();
		
		//WebElement submit1= driver.findElement(By.name("buttonlogin"));
		
		
	/*	WebElement radioButton= driver.findElement(By.xpath("//input[@value='Female']"));
		radioButton.click();
		
		WebElement radioButtonExp= driver.findElement(By.xpath("//input[@value='4']"));
		radioButtonExp.click();
		
		driver.close();
		//
		 */
		
		
	}

}
