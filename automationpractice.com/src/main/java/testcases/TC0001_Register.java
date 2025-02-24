package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.driversetup;
import pageobjects.P0001_Register;
import pageobjects.P0005_SingOut;

public class TC0001_Register extends driversetup{
	static String baseurl = "http://automationpractice.com/index.php";

	@Test
	public void testlocation() throws InterruptedException {
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		P0001_Register registerobject=new P0001_Register(driver);
		registerobject.login();
		Thread.sleep(3000);
		registerobject.email_create();
		Thread.sleep(3000);
		registerobject.SubmitCreate();
		Thread.sleep(3000);
		registerobject.id_gender1();
		Thread.sleep(3000);
		registerobject.customer_firstname();
		Thread.sleep(3000);
		registerobject.customer_lastname();
		Thread.sleep(3000);
		registerobject.passwd();
		Thread.sleep(3000);
		
		WebElement day  =driver.findElement(By.xpath("//select[@id='days']"));
		Select s = new Select(day);
		Thread.sleep(3000);
		s.selectByIndex(2);
		
		WebElement month  =driver.findElement(By.xpath("//select[@id='months']"));
		Select ss = new Select(month);
		Thread.sleep(3000);
		ss.selectByIndex(2);
		
		WebElement year  =driver.findElement(By.xpath("//select[@id='years']"));
		Select sss = new Select(year);
		Thread.sleep(3000);
		sss.selectByIndex(2);
		
		registerobject.firstname();
		registerobject.lastname();
		registerobject.address1();
		registerobject.city();
		Thread.sleep(3000);
		
		WebElement state  =driver.findElement(By.xpath("//select[@id='id_state']"));
		Select state_id = new Select(state);
		Thread.sleep(3000);
		state_id.selectByIndex(2);
		
		registerobject.postcode();
		Thread.sleep(3000);
		
		WebElement country  =driver.findElement(By.xpath("//select[@id='id_country']"));
		Select country_id = new Select(country);
		Thread.sleep(3000);
		country_id.selectByIndex(1);
		
		registerobject.phone_mobile();
		registerobject.alias();
		registerobject.submit();
		Thread.sleep(3000);
		
		P0005_SingOut singoutobject = new P0005_SingOut(driver);
		singoutobject.logout();
		Thread.sleep(3000);
	}
}
