package POM_JPET;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utilities {
	
	
		static WebDriver dr;
		public utilities(WebDriver dr) {
			this.dr=dr;
		}
		
		public WebElement waitForElement(By locator, int timeout) {
			try {
				WebDriverWait wait = new WebDriverWait(dr, timeout);
				WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
				System.out.println("Element Located");
				return element;
				
			}catch(Exception e) {
				System.out.println("Element not located " + e);
			}
			return null;
		}
		
		public WebElement elementToBeClickable(By locator, int timeout) {
			try {
				WebDriverWait wait = new WebDriverWait(dr, timeout);
				WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
				System.out.println("Element Located");
				return element;
				
			}catch(Exception e) {
				System.out.println("Element not located " + e);
			}
			return null;
		}
		
		static int counter=1;
		public void getSS()
		{
			String path="C:\\Users\\BLTuser.BLT0191\\software\\";
			String filename=counter + ".png";
			
			File f1=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
			File f2=new File(path+filename);
			
			try {
				FileUtils.copyFile(f1, f2);

			}catch (IOException e) {
				System.out.println("Screen shot no. :" + counter + "failed");
				e.printStackTrace();
			}counter++;
			
		}
		
		public static WebDriver launch_browser(String browser, String url)
		{
			WebDriver dr=null;
			switch(browser)
			{
			case "CHROME":
				System.setProperty("webdriver.chrome.driver", "chromedriver_v79.exe");
				dr= new ChromeDriver();
				break;
				
			case "FIREFOX":
				System.setProperty("webdriver.gecko.driver","GeckoDriver.exe");
				dr = new FirefoxDriver();
				break;

			}
			dr.get(url);
//			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			return dr;
		}
		
	}


