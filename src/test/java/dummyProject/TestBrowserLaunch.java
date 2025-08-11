package dummyProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestBrowserLaunch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh Kumar\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.heb.com/");
		driver.manage().window().maximize();
		String strHomePageTtl = driver.getTitle();
		if (strHomePageTtl.contains("H-E-B")) {
			System.out.println("HEB Home page is displayed");
		} else {
			System.out.println("HEB Home page is not displayed");
		}

		WebElement Pharmacy = driver.findElement(By.xpath("//ul[@data-qe-id='navigationList']//a[text()='Pharmacy']"));
		WebElement Hltservices = driver.findElement(By.xpath("//button[contains(text(),'Health services')]"));
		WebElement LabServ = driver.findElement(By.xpath("//span[text()='Lab services']"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		act.moveToElement(Pharmacy).build().perform();
		act.moveToElement(Hltservices).build().perform();
		LabServ.click();

		String strPageTitle = driver.getTitle();
		if (strPageTitle.contains("Ulta Lab Tests")) {
			System.out.println("Ulta Lab Test page is displayed");
		} else {
			System.out.println("Ulta Lab Test page is not displayed");
		}

		//driver.quit();

	}

}
