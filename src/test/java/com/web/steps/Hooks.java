package com.web.steps;

import com.qz.factory.WebDriverFactory;
import com.tests.runners.WebRunner;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static com.qz.factory.WebDriverFactory.*;

public class Hooks {
    public static WebDriver driver;
    @BeforeAll
    public static void initializingReportDrivers(){
        initializeDriver();
    }

    @Before
    public static void launchApplication(){
        openApp();
    }

    @BeforeStep
    public static void beforeEveryStep(){
       // System.out.println("beforeEveryStep");
    }

    @AfterStep
    public static void afterEveryStep(){
       // System.out.println("afterEveryStep");
    }

    @After
    public static void closeBrowser(){
        System.out.println("closeBrowser");
    }

    @AfterAll
    public static void killSession(){
        killWebDriver();
    }
}
