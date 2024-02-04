package org.java.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ProfileUpdater {

    public static void profileUpdate(String username, String password) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.naukri.com/nlogin/login");

            TimeUnit.SECONDS.sleep(5);

            WebElement usernameField = driver.findElement(By.id("usernameField"));
            WebElement passwordField = driver.findElement(By.id("passwordField"));
            WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));

            usernameField.sendKeys(username);
            passwordField.sendKeys(password);

            TimeUnit.SECONDS.sleep(5);

            submitButton.click();

            TimeUnit.SECONDS.sleep(5);

            WebElement profileLink = driver.findElement(By.xpath("//a[@href='/mnjuser/profile']"));
            profileLink.click();

            TimeUnit.SECONDS.sleep(5);

            WebElement resumeSummaryLink = driver.findElement(By.xpath("//*[@id='lazyResumeHead']/div/div/div[1]/span[2]"));
            resumeSummaryLink.click();

            TimeUnit.SECONDS.sleep(5);

            String newResumeHeadline = "2+ years experience in Java, J2EE, Collection Framework, Multithreading, Spring, Spring MVC, Spring Boot, Spring REST, Spring security and Spring Microservices. Good understanding of MySQL database, Postman, Git & GitHub, Maven, SDLC, HTML, CSS, JS.";
            WebElement resumeHeadlineTextarea = driver.findElement(By.className("resumeHeadlineTxt"));

            TimeUnit.SECONDS.sleep(5);
            resumeHeadlineTextarea.clear();
            resumeHeadlineTextarea.sendKeys(newResumeHeadline);
            TimeUnit.SECONDS.sleep(5);

            WebElement saveButton = driver.findElement(By.xpath("/html/body/div[6]/div[7]/div[2]/form/div[3]/div/button"));
            TimeUnit.SECONDS.sleep(5);

            saveButton.click();

            TimeUnit.SECONDS.sleep(5);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.close();
        }
    }


    public static void codeAt7Am() {
    	
    	 int count = 2;
         while (count > 0) {
             profileUpdate("rdkhandekar965@gmail.com", "Wildtiger@123");
             //profileUpdate("rushikeshkhandekar@gmail.com", "Wildtiger@123");
             //profileUpdate("rdkhandekar06@gmail.com", "Wildtiger@123");
             count--;
             System.out.println(java.time.LocalTime.now());
             try {
                 TimeUnit.SECONDS.sleep(10);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
         
    }
    
    public static void main(String[] args) {
    	
    	while (true) {
    		java.time.LocalTime currentTime = java.time.LocalTime.now();
    		System.out.println(currentTime);
    		if (currentTime.getHour() == 13 && currentTime.getMinute() == 27 && currentTime.getSecond() == 00) {
    			codeAt7Am();
    			break;
    		}
    		
    		try {
    			TimeUnit.SECONDS.sleep(1);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
    	}
    }
    
}
