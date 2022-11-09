package org.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Own {
public static void main(String[]args) throws AWTException  {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Nithya\\eclipse_workspace\\SeleniumTask-17-Sep\\driver\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.omrbranch.com/");
		
		driver.manage().window().maximize();
		
		WebElement btnlogin=driver.findElement(By.id("email"));
		btnlogin.click();
		
		Robot  robot = new Robot();
	     //n
	    robot.keyPress(KeyEvent.VK_N);
	    robot.keyRelease(KeyEvent.VK_N);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
}
}
