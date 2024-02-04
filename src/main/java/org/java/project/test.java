package org.java.project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class test {

    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver"); // Replace with the actual path

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/nlogin/login");

        WebElement emailElement = driver.findElement(By.id("usernameField"));
        emailElement.clear();
        emailElement.sendKeys("rushikeshkhandekar@gmail.com");

        WebElement passElement = driver.findElement(By.id("passwordField"));
        passElement.clear();
        passElement.sendKeys("Wildtiger@123");
        passElement.sendKeys(Keys.RETURN);

        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        WebElement profileLink = driver.findElement(By.xpath("//a[@href='/mnjuser/profile']"));
        profileLink.click();

        List<WebElement> resumeHeadlineSpans = driver.findElement(By.id("lazyResumeHead"))
                .findElements(By.tagName("span"));

        for (WebElement span : resumeHeadlineSpans) {
            if ("Edit".equals(span.getText())) {
                span.click();
                break;
            }
        }

        String headline = "Extensive 5.6 years of Mobile app development. "
                + "I have worked on Android, iOS, Xamarin Forms, Titanium Appcelerator. "
                + "I am also open to work on new technologies. Also have experience with server side technologies and frameworks.";

        WebElement resumeHeadlineTextArea = driver.findElement(By.className("resumeHeadlineTxt"));
        resumeHeadlineTextArea.clear();
        resumeHeadlineTextArea.sendKeys(headline);

        List<WebElement> btnList = driver.findElements(By.tagName("button"));

        for (WebElement item : btnList) {
            if ("SAVE".equals(item.getText())) {
                item.click();
                break;
            }
        }

        driver.quit();
    }
}