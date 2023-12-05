package automation.ManPowerAgency;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OLSI1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver  driver= new ChromeDriver();

		driver.get("https://manpowerlurit.s3.amazonaws.com/Manpower/index.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		
		Thread.sleep(3000);


		
		driver.findElement(By.xpath("//ul//li//a[text()='About Us']")).click();
	
		Thread.sleep(3000);
		 
        driver.findElement(By.xpath("//a[text()='Home']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//ul//li//a[text()='Services']")).click();
		
        Thread.sleep(3000);

         driver.findElement(By.xpath("//a[text()='Home']")).click();
		
		Thread.sleep(3000);
		
       // driver.findElement(By.xpath("//div[@class='bx-wrapper']['Carrer Management']")).click();
        //Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li//a[text()='Blogs']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//a[text()='Home']")).click();
		
		Thread.sleep(3000);
        
		driver.findElement(By.xpath("//ul//li//a[text()='Contact']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//a[text()='Home']")).click();
		
		Thread.sleep(4000);
		
     
        
        
        
        
        //driver.findElement(By.xpath("//div//i[@class='fa fa-angle-up fa-3x']")).click();
        //Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
	}

	}


