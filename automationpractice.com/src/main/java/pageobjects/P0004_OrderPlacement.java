package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P0004_OrderPlacement {
	WebDriver driver = null;

	public P0004_OrderPlacement(WebDriver driver) {
		this.driver = driver;
	}
	By button2=By.xpath("(//i[@class='icon-chevron-right right'])[2]");
	By button3=By.xpath("(//i[@class='icon-chevron-right right'])[3]");
	By button7=By.xpath("(//i[@class='icon-chevron-right right'])[7]");
	By checkbox=By.xpath("//input[@type='checkbox']");
	By bankwire=By.xpath("//a[@class='bankwire']");
	
	public void button2() {
		driver.findElement(button2).click();
	}
	public void button3() {
		driver.findElement(button3).click();
	}
	public void button7() {
		driver.findElement(button7).click();
	}
	public void checkbox() {
		driver.findElement(checkbox).click();
	}
	public void bankwire() {
		driver.findElement(bankwire).click();
	}
}
