package dummyProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh Kumar\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        WebElement flipkarticon=driver.findElement(By.xpath("//img[@title='Flipkart']"));
        Boolean b=flipkarticon.isDisplayed();
        Actions act =new Actions(driver);
        if(b==true)
        	//if we want to compare integers then
        	//if(b>5)
        {
        	System.out.println("validation pass");
        }
        else
        {
        	System.out.println("fail");
        }

        WebElement seller=driver.findElement(By.xpath("//a[text()='Become a Seller']"));
        Boolean b1=seller.isEnabled();
        if(b1==false)
        {
        	System.out.println("validation failed");
        }
        else
        {
        	System.out.println("pass");
        }
        List<WebElement> footerlinks=driver.findElements(By.xpath("//div[@class='_3I5N7v']"));
        for(int i=0;i<footerlinks.size();i++)
        {
        	Boolean b2=footerlinks.get(i).isEnabled();
        	String strtext=footerlinks.get(i).getText();
        	if(b2==true)
        	{
        		System.out.println("pass"+" "+strtext);
        	}
        	else
        	{
        		System.out.println("fail"+" "+strtext);
        	}
        }
      //isselected cmd
    	driver.navigate().to("https://demoqa.com/automation-practice-form");
    	WebElement radiobutton=driver.findElement(By.xpath("//label[text()='Male']/.."));
    	Boolean b4=radiobutton.isSelected();
    	if(b4==true)
    	{
    		System.out.println("validation pass before selecting checkbox");
    	}
    	else
    	{
    		System.out.println("fail before selecting checkbox");
    	}
    	Thread.sleep(5000);
    	//WebElement radiobutton1=driver.findElement(By.xpath("//label[text()='Male']/.."));
    	radiobutton.click();
    	Thread.sleep(5000);
    	Boolean b5=radiobutton.isSelected();
    	if(b5==true)
    	{
    		System.out.println("validation pass after selecting checkbox");
    	}
    	else
    	{
    		System.out.println("fail after selecting checkbox");
    	}

	}
}
