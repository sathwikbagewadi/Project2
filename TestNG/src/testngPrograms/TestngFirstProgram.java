package testngPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngFirstProgram
{
	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void demo()
	{
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//	    driver = new ChromeDriver();
//		driver.get("https://demowebshop.tricentis.com/");
//		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
	}
	@Test (groups=("smoke"))
	public void demoone()
	{
		driver.findElement(By.xpath("//a[@href='/register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		//System.out.println("Apple");
	}
	@Test  (groups=("smoke"))
	public void demotwo()  
	{
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("satwik.bagewadi");
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("Password");
	}
	@AfterMethod
	public void example() {
		driver.close();
	}

}
