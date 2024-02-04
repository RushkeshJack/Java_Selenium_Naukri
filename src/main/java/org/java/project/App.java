package org.java.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App 
{
    public static void main( String[] args )
    {
    	        // Set the path to the chromedriver executable
    	        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

    	        // Create an instance of ChromeDriver
    	        WebDriver driver = new ChromeDriver();

    	        // Navigate to the Naukri login page
    	        driver.get("https://www.naukri.com/nlogin/login");

    	        // Enter your Naukri username and password
    	        String username = "rushikeshkhandekar@gmail.com";
    	        String password = "Wildtiger@123";	

    	        // Locate the username and password fields and submit button
    	        WebElement usernameField = driver.findElement(By.id("usernameField"));
    	        WebElement passwordField = driver.findElement(By.id("passwordField"));
    	        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));

    	        // Enter the username and password
    	        usernameField.sendKeys(username);
    	        passwordField.sendKeys(password);

    	        // Click the submit button to login
    	        submitButton.click();
    	        
    	     // Wait for the login to complete (replace with an appropriate condition)
    	        try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    	        
    	        WebElement profileLink = driver.findElement(By.xpath("//a[@href='/mnjuser/profile']"));

    	        // Click the profile link to navigate to the profile page
    	        profileLink.click();
    	        
    	       
    	        
    	        WebElement resumeSummaryLink = driver.findElement(By.xpath("//*[@id=\"lazyResumeHead\"]/div/div/div[1]/span[2]"));

    	        // Click the profile link to navigate to the profile page
    	        resumeSummaryLink.click();
    	        
    	        try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

    	        // Close the browser
    	        driver.quit();
    	    
    	

    }
}
