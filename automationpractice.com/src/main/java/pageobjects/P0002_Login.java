package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P0002_Login {

	WebDriver driver = null;

	public P0002_Login(WebDriver driver) {

		this.driver = driver;
		}
	By login=By.xpath("//a[@class='login']");
	By email=By.xpath("//input[@id='email']");
	By passwd=By.xpath("//input[@id='passwd']");
	By SubmitLogin=By.xpath("//button[@id='SubmitLogin']");
	
	public void login() {
		driver.findElement(login).click();
	}
	public void email() {
		driver.findElement(email).sendKeys("jamesroybrown@gmail.com");
	}
	public void passwd() {
		driver.findElement(passwd).sendKeys("12345");
	}
	public void SubmitLogin() {
		driver.findElement(SubmitLogin).click();
	}
	
	
	
}
