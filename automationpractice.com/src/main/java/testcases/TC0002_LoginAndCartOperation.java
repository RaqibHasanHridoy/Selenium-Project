package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.driversetup;
import pageobjects.P0002_Login;
import pageobjects.P0003_Shopping;
import pageobjects.P0004_OrderPlacement;
import pageobjects.P0005_SingOut;

public class TC0002_LoginAndCartOperation extends driversetup {
	static String baseurl = "http://automationpractice.com/index.php";

	@Test
	public void testlocation() throws InterruptedException {
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		P0002_Login loginobject=new P0002_Login(driver);
		loginobject.login();
		Thread.sleep(3000);
		loginobject.email();
		loginobject.passwd();
		Thread.sleep(3000);
		loginobject.SubmitLogin();
		Thread.sleep(3000);
		
		//Mouse hover over a menu function
		Actions action= new Actions(driver);
		WebElement element =driver.findElement(By.xpath("//a[@title='Women']"));
		action.moveToElement(element).build().perform();
		Thread.sleep(5000);
		//Mouse hover continues for sub menu and click it
		WebElement element2=driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[1]"));
		action.moveToElement(element2);
		action.click().build().perform();
		Thread.sleep(5000);
		//Mouse Hover completed
		
		P0003_Shopping shoppinobject=new P0003_Shopping(driver);
		shoppinobject.Printed_Dress();
		Thread.sleep(3000);
		shoppinobject.exclusive();
		Thread.sleep(3000);
		shoppinobject.continueShopping();
		Thread.sleep(3000);
		//Casual dresses done
		
		//Mouse hover over a menu function
				Actions action3= new Actions(driver);
				WebElement element3 =driver.findElement(By.xpath("//a[@title='Women']"));
				action3.moveToElement(element3).build().perform();
				Thread.sleep(5000);
				//Mouse hover continues for sub menu and click it
				WebElement element4=driver.findElement(By.xpath("//a[@title='T-shirts']"));
				//driver.findElement(By.)
				action3.moveToElement(element4);
				action3.click().build().perform();
				Thread.sleep(5000);
				//Mouse Hover completed 
				
				shoppinobject.Faded_Short_Sleeve_Tshirts();
				Thread.sleep(3000);
				shoppinobject.color_14();
				Thread.sleep(3000);
				shoppinobject.exclusive();
				Thread.sleep(3000);
				//T-Shirt done
				
				P0004_OrderPlacement orderobject =new P0004_OrderPlacement(driver);
				orderobject.button2();
				Thread.sleep(3000);
				orderobject.button3();
				Thread.sleep(3000);
				orderobject.button7();
				Thread.sleep(3000);
				orderobject.checkbox();
				Thread.sleep(3000);
				orderobject.button3();
				Thread.sleep(3000);
				orderobject.bankwire();
				Thread.sleep(3000);
				orderobject.button3();
				Thread.sleep(3000);
				//order and payment completed
		        P0005_SingOut signoutobject =new P0005_SingOut(driver);
				signoutobject.logout();
				Thread.sleep(3000);
				//Sign out completed
}
}
