package Calender;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

/*import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;*/




public class CalenderDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohammad Adnan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//disable notifications
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(5000);
		Actions a =new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-13awgt0 r-18u37iz']/div[3]"))).click().sendKeys("Bengaluru").build().perform();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("div[class*='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']/div[text()='Select Date']")).click();
		String Month = driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-19h5ruw r-184en5c']/div[1]")).getText();
		while(true)
		{
			if(Month.equalsIgnoreCase("August 2023"))
			{
				//driver.findElement(By.xpath("//div[@data-testid='undefined-month-August-2023']/div[3]/div[4]/div[6]")).click();
			break;
			}
			
			else
			{
				Thread.sleep(3000);
				driver.findElement(By.cssSelector("div[class*='css-1dbjc4n r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles']")).click();
			}
		}
		driver.findElement(By.xpath("//div[@data-testid='undefined-month-August-2023']/div[3]/div[4]/div[6]")).click();
		
		System.out.println("Data is selected successfully");
		
		
		
		
		
	}}
		
		