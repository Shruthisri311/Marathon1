package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.pvrcinemas.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.className("cinemas-inactive")).click();	
		driver.findElement(By.xpath("//span[text()=\"Select Cinema\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		driver.findElement(By.xpath("(//span[text()='BAD GIRL'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='04:40 PM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Book'])[4]")).click();
		//click on accept button
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		//select the seat #
		driver.findElement(By.xpath("(//span[text()='13'])[2]")).click();
		//print seat# in console
		String text =driver.findElement(By.xpath("//div[@class='seat-number']")).getText();
		System.out.println(text);
		//print grand total
		String text2=driver.findElement(By.xpath("//div[@class='grand-prices']")).getText();
		System.out.println(text2);
        //click proceed button
		driver.findElement(By.xpath("(//button[contains(@class,'sc-eVqvcJ')])[2]")).click();
		//click to continue
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		//click cancel
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		//close driver
		Thread.sleep(2000);
		driver.close();		
		
	}

}
