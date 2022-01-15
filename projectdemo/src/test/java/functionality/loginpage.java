package functionality;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.inject.spi.Elements;

import objectrepository.elements;



public class loginpage 
{
	 @Test
	  public void loginfun() throws IOException, AWTException, InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver","D:\\new2\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		  driver.manage().window().maximize();
		  
		  PageFactory.initElements(driver,elements.class);
		  
		  
		  elements.username1.sendKeys("Ynitin157@gmail.com");
		  elements.login1.click();
		  
		  WebDriverWait wdw = new WebDriverWait(driver,20);
		  wdw.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@name='id_gender'])[1]")));
		  elements.click1.click();
		  
		  elements.customer1.sendKeys("Nitin");
		  elements.customer2.sendKeys("Yadav");
		  elements.clear1.clear();
		  elements.email1.sendKeys("Ynitin157@gmail.com");
		  elements.email2.sendKeys("Ynitin000@");
		  elements.days1.sendKeys("10");
		  elements.month1.sendKeys("july");
		  elements.years1.sendKeys("1997");
		  elements.click2.click();
		  elements.firstname1.sendKeys("Nitin");
		  elements.lastname2.sendKeys("Yadav");
		  elements.company.sendKeys("HCL");
		  elements.address3.sendKeys("old panchwati ghaziabad");
		  elements.address4.sendKeys("panchwati");
		  elements.city.sendKeys("ghaziabad");
		  elements.state.sendKeys("Florida");
		  elements.postcode.sendKeys("00000");
		  elements.country1.sendKeys("United States");
		  elements.other.sendKeys("9810262894");
		  elements.phone1.sendKeys("9910305181");
		  elements.phone2.sendKeys("9910183070");
		  elements.alias.clear();
		  elements.alias.sendKeys("hello");
		  elements.click3.click();
		  
		  
		  
		  
		  
		  
		  
		  Robot robot = new Robot();
		  Dimension screenshot_size=Toolkit.getDefaultToolkit().getScreenSize();
		  Rectangle rect = new Rectangle(screenshot_size); 
		  BufferedImage Source=robot.createScreenCapture(rect);
		  File destination = new File("C:\\Users\\HP\\Downloads\\Screenshot\\screen10.jpg");
		  ImageIO.write(Source,"png", destination);
		  
		
	  }	  
		  
}
