package testngPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class fourthprogram  // different URLs open and close
{
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    driver = new ChromeDriver();
		//driver.get("https://demowebshop.tricentis.com/");
		
	}
	@Test 
	public void demo()
	{
		driver.get("https://demowebshop.tricentis.com/");
	}
	@Test 
	public void demo2() throws InterruptedException
	{
		driver.navigate().to("https://www.amazon.ca/");
		Thread.sleep(2000);
		//System.out.println("papaya");
		//driver.manage().window().maximize();
	}
	@Test 
	public void demo3() throws InterruptedException
	{
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		//driver.manage().window().maximize();
	}
	@Test 
	public void demo4() throws InterruptedException
	{
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(2000);
	}
	@Test 
	public void demo5() throws InterruptedException
	{
		driver.navigate().to("https://twitter.com/");
		Thread.sleep(2000);
	}
	@AfterMethod
	public void example() 
	{
		driver.close();
		
	}

}
