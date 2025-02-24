package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P0003_Shopping {
	WebDriver driver = null;

	public P0003_Shopping(WebDriver driver) {
		this.driver = driver;
	}

	By Printed_Dress = By.xpath("//img[@title='Printed Dress']");
	By exclusive = By.xpath("//button[@class='exclusive']");
	By continueShopping=By.xpath("//i[@class='icon-chevron-left left']");
	By Faded_Short_Sleeve_Tshirts=By.xpath("//img[@title='Faded Short Sleeve T-shirts']");
	By color_14=By.xpath("//a[@id='color_14']");
	
	public void Printed_Dress() {
		driver.findElement(Printed_Dress).click();
	}
	public void exclusive() {
		driver.findElement(exclusive).click();
	}
	public void continueShopping() {
		driver.findElement(continueShopping).click();
	}
	public void Faded_Short_Sleeve_Tshirts() {
		driver.findElement(Faded_Short_Sleeve_Tshirts).click();
	}
	public void color_14() {
		driver.findElement(color_14).click();
	}
}
