package com.libraryCT.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/libraryCT/step_definitions",
        tags = "@editUser",
        dryRun = false
)

public class CukesRunner {
}
