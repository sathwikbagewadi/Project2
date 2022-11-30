package Practicals;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PracticalsTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//input[@value='radio1']")).click(); //Radio one

        driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("India"); // India

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//div[@id='ui-id-3']")).click();

        WebElement dropdown=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        Select sel = new Select(dropdown);
        sel.selectByVisibleText("Option3");

        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
        driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();

        driver.findElement(By.xpath("//button[@id='openwindow']")).click();

        String parent=driver.getWindowHandle();

        Set<String> childwindow = driver.getWindowHandles();

        for (String window: childwindow)

        {

               driver.switchTo().window(window);

               driver.manage().window().maximize();

               driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

               if (driver.getTitle().contains("Selenium"))

               {

                     driver.close();

               }

        }

        driver.switchTo().window(parent);

        driver.findElement(By.xpath("//a[@id='opentab']")).click();

        Set<String>tab=driver.getWindowHandles();

        for (String childtab: tab)

        {

             driver.switchTo().window(childtab);

             if (driver.getTitle().contains("Rahul "))

             {

                    driver.findElement(By.xpath("(//a[text()='JOIN NOW'])[1]")).click();

                    driver.close();

             }

        }

      

        driver.switchTo().window(parent);

       

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("FirstAlert");

        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();

        Alert al1 = driver.switchTo().alert();

        al1.accept();

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("SecondtAlert");

        driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();

        Alert al2 = driver.switchTo().alert();

        al2.dismiss();

       

       List <WebElement> ObjLink = driver.findElements(By.tagName("tr"));

       for (WebElement ObjCurrentLink: ObjLink)

       {

          String link = ObjCurrentLink.getText();

          System.out.println(link);

       }

       driver.findElement(By.xpath("//input[@id='displayed-text']")).sendKeys("Sathwik");

       driver.findElement(By.xpath("//input[@id='hide-textbox']")).click(); //hide

       driver.findElement(By.xpath("//input[@id='show-textbox']")).click(); // show again

      

       JavascriptExecutor js = (JavascriptExecutor)driver;

       js.executeScript("window.scrollBy(0,1000)");

       

       Actions act = new Actions(driver);

       WebElement mouse=driver.findElement(By.xpath("//button[@id='mousehover']"));

       Thread.sleep(2000);

       act.moveToElement(mouse).build().perform();

       Thread.sleep(2000);

       WebElement reload=driver.findElement(By.xpath("//a[text()='Reload']"));

       act.moveToElement(reload).click().perform();

       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

      

       js.executeScript("window.scrollBy(0,1500)");

      

       driver.switchTo().frame("iframe-name");

       js.executeScript("window.scrollBy(0,1000)");

       Thread.sleep(2000);

       driver.findElement(By.xpath("//a[@href='practice-project']")).click();

       System.out.println("Program completed successfully");
       
       driver.close();
		
	}


		
	}


