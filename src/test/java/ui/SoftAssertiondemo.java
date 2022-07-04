package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertiondemo {
	
	@Test
	public void verifytext() {
		SoftAssert softassert=new SoftAssert();
		String expectedtitle="Egg";
		String expectedtext="Search";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
		String actuatitle=driver.getTitle();
		softassert.assertEquals(actuatitle, expectedtitle,"Texting failed");
		String actualtext=driver.findElement(By.xpath("//input[@id='gh-btn']")).getAttribute("value");
		//softassert.assertEquals(actuatitle, expectedtitle);
		softassert.assertEquals(actualtext, expectedtext, "Testig passed");
		softassert.assertAll();
	}

}
