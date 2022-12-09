package testngPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class firstprogram1 // DemoWebShop web elements
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

        driver.findElement(By.xpath("//a[@href='/register']")).click();
        Thread.sleep(2000);

    }

    @Test

    public void demo2() throws InterruptedException

    {

          driver.findElement(By.xpath("//a[@href='/login']")).click();
          Thread.sleep(2000);
         // System.out.println("orange");

    }

   

    @Test 

    public void demo3() throws InterruptedException

    {
       driver.findElement(By.xpath("(//span[@class='cart-label'])[1]"));
       Thread.sleep(2000);

    }

   

    @Test 

    public void demo4() throws InterruptedException

    {

       driver.findElement(By.xpath("(//span[@class='cart-label'])[2]"));
       Thread.sleep(2000);

    }

    @Test 

    public void demo5() throws InterruptedException

    {

      driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]")).sendKeys("shoes");
      Thread.sleep(2000);

    }
    
    @AfterMethod

    public void example1()

    {
     driver.close();
    }
}

