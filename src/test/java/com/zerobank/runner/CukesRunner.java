package com.zerobank.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resourses/features",
        glue = "com/zerobank/stepdefinitions",
        dryRun = false,
        tags = " @AccountActivityNavigation",
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json"}
)

public class CukesRunner {
        }
