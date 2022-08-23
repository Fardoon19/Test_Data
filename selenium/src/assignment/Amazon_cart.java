package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_cart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Adv_sel/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("nike shoes");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-component-type='s-search-result' and @data-cel-widget='search_result_4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='submit.add-to-cart-announce']")).click();
	}
}
