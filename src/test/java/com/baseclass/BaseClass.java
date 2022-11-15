package com.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public static WebDriver driver;
	
	public static void getDriver(String type) {
		switch(type) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case"edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case"firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		
		
		}}
		
	public static void getUrl(String url) {
		
		driver.get(url);
	}	
		
public static void setValue(WebElement element, String data) {
	element.sendKeys(data);
	
}		

public static void click(WebElement element) {
	element.click();
	
	
}

public static String getTitle() {
	
	String title =  driver.getTitle();
	
	return title;
	}

   
public static WebElement findElementById(String Id) {
	
	WebElement element = driver.findElement(By.id(Id));
	return element;
	
	
}



public static WebElement findELementByName(String Name) {
	WebElement element = driver.findElement(By.name(Name));
	return element;
	
}

public static void maximize() {
	
	driver.manage().window().maximize();
	
}


public static void closeAllWindow() {
	
	driver.quit();
	
}


public static String getText(WebElement element) {
	
	String text = element.getText();
	return text;
	
	
	
}


public static String getAttribute(WebElement element, String attributeName) {
	String attribute = element.getAttribute(attributeName);
	return attribute;
	
}


public static void selectOptionByText(WebElement element,String text) {
	Select select = new Select (element);
	select.selectByVisibleText(text);
}

public static void selectOptionByIndex(WebElement element, int index) {
	Select select = new Select(element);
	select.selectByIndex(0);
	
	
	
}


public static void selectByValue(WebElement element, String text) {
	Select select = new Select(element);
	select.selectByValue(text);
	
}


public static String getPropertyFileValue(String Key) throws FileNotFoundException, IOException {
	Properties properties =new Properties();
	
	properties.load(new FileInputStream(System.getProperty("user.dir")+ "\\config.properties"));
	Object object =properties.get(Key);
	String value =(String) object;
	return value;
	
}

public static void cancelAlert() {
	
	Alert alert = driver.switchTo().alert();
	alert.dismiss();
	
}


public static void oKAlert() {
	Alert alert = driver.switchTo().alert();
	alert.accept();
	
	
}


public void createCellAndInsertValue(String path, String sheetname, )		
	
	
	
	}


