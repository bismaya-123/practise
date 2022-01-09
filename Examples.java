package selenium_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Examples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String bismayChromePath="C:\\Users\\BISHAL\\Downloads\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", bismayChromePath);

		WebDriver driver=new ChromeDriver();
		
		String amazonurl="https://www.amazon.in/";
		driver.get(amazonurl);
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		WebElement electronicsWE=driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		electronicsWE.click();
		
		Thread.sleep(300);
		WebElement accessoriesWE=driver.findElement(By.xpath("//span[text()='Accessories']"));
		accessoriesWE.click();
	}

}
