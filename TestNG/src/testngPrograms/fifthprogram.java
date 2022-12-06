package testngPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class fifthprogram // DemoWebShop WebElements using different types of Xpath locators
{
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
}
	@Test
	public void demo1() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='Register']")).click();
        Thread.sleep(2000);
	}
	
	@Test (groups=("smoke"))
	public void demo2() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
        Thread.sleep(2000);
     //   System.out.println("mango");
	}
	
	@Test
	public void demo3() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
        Thread.sleep(2000);
	}
	
	@Test
	public void demo4() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
        Thread.sleep(2000);
	}
	
	@Test
	public void demo5() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='vote-poll-1']")).click();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void example()
	{
		driver.close();
	}
}
