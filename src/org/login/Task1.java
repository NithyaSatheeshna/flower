package org.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
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
		//i
	    robot.keyPress(KeyEvent.VK_I);
	    robot.keyRelease(KeyEvent.VK_I);
		//t
	    robot.keyPress(KeyEvent.VK_T);
	    robot.keyRelease(KeyEvent.VK_T);
	    //h
	    robot.keyPress(KeyEvent.VK_H);
	    robot.keyRelease(KeyEvent.VK_H);
	    //i
	    robot.keyPress(KeyEvent.VK_I);
	    robot.keyRelease(KeyEvent.VK_I);
		//1
	    robot.keyPress(KeyEvent.VK_1);
	    robot.keyRelease(KeyEvent.VK_1);
		//8
	    robot.keyPress(KeyEvent.VK_8);
	    robot.keyRelease(KeyEvent.VK_8);
		//1
	    robot.keyPress(KeyEvent.VK_1);
	    robot.keyRelease(KeyEvent.VK_1);
		//2
	    robot.keyPress(KeyEvent.VK_2);
	    robot.keyRelease(KeyEvent.VK_2);
		//1
	    robot.keyPress(KeyEvent.VK_1);
	    robot.keyRelease(KeyEvent.VK_1);
		//9
	    robot.keyPress(KeyEvent.VK_9);
	    robot.keyRelease(KeyEvent.VK_9);
	    //9
	    robot.keyPress(KeyEvent.VK_9);
	    robot.keyRelease(KeyEvent.VK_9);
	    //6
	    robot.keyPress(KeyEvent.VK_6);
	    robot.keyRelease(KeyEvent.VK_6);
	    //press shift
	    robot.keyPress(KeyEvent.VK_SHIFT);
	    //2
	    robot.keyPress(KeyEvent.VK_2);
	    //press shift
	    robot.keyRelease(KeyEvent.VK_SHIFT);
	    //g
	    robot.keyPress(KeyEvent.VK_G);
	    robot.keyRelease(KeyEvent.VK_G);
	    //m
	    robot.keyPress(KeyEvent.VK_M);
	    robot.keyRelease(KeyEvent.VK_M);
	    //a
	    robot.keyPress(KeyEvent.VK_A);
	    robot.keyRelease(KeyEvent.VK_A);
	    //i
	    robot.keyPress(KeyEvent.VK_I);
	    robot.keyRelease(KeyEvent.VK_I);
	    //l
	    robot.keyPress(KeyEvent.VK_L);
	    robot.keyRelease(KeyEvent.VK_L);
	    //.
	    robot.keyPress(KeyEvent.VK_PERIOD);
	    //c
	    robot.keyPress(KeyEvent.VK_C);
	    robot.keyRelease(KeyEvent.VK_C);
	    //o
	    robot.keyPress(KeyEvent.VK_O);
	    robot.keyRelease(KeyEvent.VK_O);
	    //m
	    robot.keyPress(KeyEvent.VK_M);
	    robot.keyRelease(KeyEvent.VK_M);
	    //tab
	    robot.keyPress(KeyEvent.VK_TAB);
	    robot.keyRelease(KeyEvent.VK_TAB);
         //n
	    robot.keyPress(KeyEvent.VK_N);
	    robot.keyRelease(KeyEvent.VK_N);
		//i
	    robot.keyPress(KeyEvent.VK_I);
	    robot.keyRelease(KeyEvent.VK_I);
		//t
	    robot.keyPress(KeyEvent.VK_T);
	    robot.keyRelease(KeyEvent.VK_T);
	    //h
	    robot.keyPress(KeyEvent.VK_H);
	    robot.keyRelease(KeyEvent.VK_H);
	    //i
	    robot.keyPress(KeyEvent.VK_I);
	    robot.keyRelease(KeyEvent.VK_I);
	    //enter
	    robot.keyPress(KeyEvent.VK_ENTER);
	    //tab
	    robot.keyPress(KeyEvent.VK_TAB);
	    
	    
	    
	    
	    
	    
	    
	}	   
	
}
