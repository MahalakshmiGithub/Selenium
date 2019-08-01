package org.alpha.ExcelOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AccessingwithInSamePackage {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\eclipse\\demo\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.iN"); 
		WebElement buttonCategory =driver.findElement(By.id("nav-link-shopall"));
		Actions act=new Actions(driver);
		act.moveToElement(buttonCategory).perform();
		WebElement mobl =driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
		act.moveToElement(mobl).perform();
		WebElement btnclck=driver.findElement(By.xpath("//span[text()='Power Banks']"));
		btnclck.click();
		driver.quit();
	}



}
