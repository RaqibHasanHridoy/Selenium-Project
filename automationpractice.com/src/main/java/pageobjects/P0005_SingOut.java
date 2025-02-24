package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P0005_SingOut {
	WebDriver driver = null;

	public P0005_SingOut(WebDriver driver) {
		this.driver = driver;
	}
	By logout=By.xpath("//a[@class='logout']");
	
	public void logout() {
		driver.findElement(logout).click();
	}

}
