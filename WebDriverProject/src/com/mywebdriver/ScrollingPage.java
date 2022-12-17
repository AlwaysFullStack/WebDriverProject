package com.mywebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gulshan\\Desktop\\SeleniumWD\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//1.Scrolling Vertically by 100 pixel;
		//js.executeScript("windows.scrollBy(0,1000)","");
		//Thread.sleep(2000);
		
		//2.Scrolling page till the flag
		//WebElement bdFlag=	driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/table[1]/tbody/tr[16]/td[1]/img"));
		//js.executeScript("arguments[0].scrollIntoView();", bdFlag);
		//Thread.sleep(2000);
		
		//3. Scroll Page till bottom
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)","");
		Thread.sleep(2000);
		
		driver.quit();

	}

}
