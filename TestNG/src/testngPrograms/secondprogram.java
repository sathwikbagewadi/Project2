package testngPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class secondprogram  // Rahul Shetty practice page web elements
{
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
}
	@Test

    public void demo1() throws InterruptedException

    {

     driver.findElement(By.xpath("//input[@value='radio1']")).click();
     Thread.sleep(2000);

    }

    @Test 

    public void demo2() throws InterruptedException

    {

     driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("INDIA");
     Thread.sleep(2000);
     //System.out.println("grape");

    }

  
    @Test

    public void demo3() throws InterruptedException

    {
       driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
       Thread.sleep(2000);

    }

    @Test

    public void demo4() throws InterruptedException

    {
    	driver.findElement(By.xpath("//input[@id='displayed-text']")).sendKeys("Hello");
    	Thread.sleep(2000);

    }

    @Test

    public void demo5() throws InterruptedException

    {

     driver.findElement(By.xpath("//input[@id='displayed-text']")).sendKeys("Hello");
     driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
     Thread.sleep(2000);

    }
    @AfterMethod

    public void example()

    {
      driver.close();
    }
	
}
