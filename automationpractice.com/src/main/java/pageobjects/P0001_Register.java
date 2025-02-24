package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P0001_Register {
	WebDriver driver = null;

	public P0001_Register(WebDriver driver) {

		this.driver = driver;
}
	By login=By.xpath("//a[@class='login']");
	By email_create=By.xpath("//input[@id='email_create']");
	By SubmitCreate=By.xpath("//button[@id='SubmitCreate']");
	By id_gender1=By.xpath("//input[@id='id_gender1']");
	By customer_firstname=By.xpath("//input[@id='customer_firstname']");
	By customer_lastname=By.xpath("//input[@id='customer_lastname']");
	By passwd=By.xpath("//input[@id='passwd']");
	By firstname=By.xpath("//input[@id='firstname']");
	By lastname=By.xpath("//input[@id='lastname']");
	By address1=By.xpath("//input[@id='address1']");
	By city=By.xpath("//input[@id='city']");
	By postcode=By.xpath("//input[@id='postcode']");
	By phone_mobile=By.xpath("//input[@id='phone_mobile']");
	By alias=By.xpath("//input[@id='alias']");
	By submit=By.xpath("//button[@type='submit' and @name='submitAccount']");
	
	public void login() {
		driver.findElement(login).click();
	}
	public void email_create() {
		driver.findElement(email_create).sendKeys("jamesroymrbrown@gmail.com");
	}
	public void SubmitCreate() {
		driver.findElement(SubmitCreate).click();
	}
	public void id_gender1() {
		driver.findElement(id_gender1).click();
	}
	public void customer_firstname() {
		driver.findElement(customer_firstname).sendKeys("Mr.");
	}
	public void customer_lastname() {
		driver.findElement(customer_lastname).sendKeys("Brown");
	}
	public void passwd() {
		driver.findElement(passwd).sendKeys("12345");
	}
	public void firstname() {
		driver.findElement(firstname).sendKeys("Marine");
	}
	public void lastname() {
		driver.findElement(lastname).sendKeys("Corps");
	}
	public void address1() {
		driver.findElement(address1).sendKeys("Port city area");
	}
	public void city() {
		driver.findElement(city).sendKeys("Philadelphia");
	}
	public void postcode() {
		driver.findElement(postcode).sendKeys("12345");
	}
	public void phone_mobile() {
		driver.findElement(phone_mobile).sendKeys("123456789");
	}
	public void alias() {
		driver.findElement(alias).sendKeys("United Kingdom");
	}
	public void submit() {
		driver.findElement(submit).click();
	}
	
	




















}
