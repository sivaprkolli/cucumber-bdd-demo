package com.tests.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue="com.web.steps",
        tags = "@SE1",
        plugin = "pretty"
)
public class WebRunner {
}
