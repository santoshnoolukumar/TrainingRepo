package dummyProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
public static void main(String s[]) throws IOException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh Kumar\\Desktop\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
    //craeting a destination file to place the screenshot
    File destFile=new File("C:\\Users\\Santosh Kumar\\eclipse-workspace\\dummyProject\\Screenshots\\screenshot.png");
    //creating a src file for the screenshot
    //typecasting=driver object with takesscreenshot type class
    TakesScreenshot ts=(TakesScreenshot)driver;
    File srcFile=ts.getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(srcFile, destFile);	
}
}
