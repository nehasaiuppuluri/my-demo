package automation.ManPowerAgency;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OLSI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://manpowerlurit.s3.amazonaws.com/Manpower/index.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[normalize-space()='About Us']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[normalize-space()='Services']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[normalize-space()='Blogs']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[normalize-space()='contact ']")).click();
		Thread.sleep(4000);
		
		
	}

}
