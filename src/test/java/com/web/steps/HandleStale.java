package com.web.steps;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleStale {
    @Test
    public void handleStale(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://para.testar.org/parabank/about.htm;jsessionid=FB240F858FA900BA96DEE5A980656F85");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement userInputBox = driver.findElement(By.cssSelector("[name=\"username\"]"));

        try{
            userInputBox.sendKeys("siva");
            driver.navigate().refresh();
            userInputBox.sendKeys("siva");
        }catch (StaleElementReferenceException e){
            driver.findElement(By.cssSelector("[name=\"username\"]")).sendKeys("Siva");
        }
    }
}
