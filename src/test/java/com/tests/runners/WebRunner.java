package com.tests.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/login_test.feature",
        glue="com.web.steps",
        tags = "@LT6"
)
public class WebRunner {
}
