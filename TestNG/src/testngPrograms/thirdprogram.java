package testngPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class thirdprogram // NxtGenAIAcademy website web elements
{
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		//driver.manage().window().maximize();
	}
	@Test
	public void demo1() throws InterruptedException
	{
		driver.findElement(By.id("vfb-5")).sendKeys("Sathwik");
		Thread.sleep(2000);
	}
	@Test
	public void demo2() throws InterruptedException
	{
		driver.findElement(By.cssSelector("input[id='vfb-7'")).sendKeys("Bagewadi");
		Thread.sleep(2000);
	}
	@Test
	public void demo3() throws InterruptedException
	{
		driver.findElement(By.className("vfb-radio")).click();
		driver.findElement(By.id("vfb-13-address")).sendKeys("Mississauga");
		Thread.sleep(2000);
	}
	
	@Test 
	public void demo4() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("satwik.bag@gmail.com");
		Thread.sleep(2000);
	}
	
	@Test 
	public void demo5() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='vfb-19']")).sendKeys("1234567890");
		Thread.sleep(2000);
	}
	@AfterMethod
	public void example() 
	{
		driver.close();
		
	}
}


