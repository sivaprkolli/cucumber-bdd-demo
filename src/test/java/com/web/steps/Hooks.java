package com.web.steps;

import io.cucumber.java.*;

public class Hooks {
    @BeforeAll
    public static void initializingReportDrivers(){
      //  System.out.println("initializingReportDrivers");
    }

    @Before
    public static void launchApplication(){
        System.out.println("launchApplication");
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
      //  System.out.println("killSession");
    }
}
