package org.restfullbooker.runner;


import io.cucumber.junit.Cucumber;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.Test;

import java.io.File;

//feature to tell feature file where it is
//glue to attach feature file to it
//preety to show colourfull output on console
//html:target/CucumberReport.html to give the cucumber report

//@RunWith(Cucumber.class)
@CucumberOptions(
        //you can provdie comma ,if you want any two feature file to run
        features={"src/test/resource/featurefiles/RestfullBookerPositivetestCase_01.feature"},
        glue={"org.restfullbooker.task.task_1_positive"},


        plugin = {
                 "json:target/CucumberReports/CucumberReport.json",
                "junit:target/CucumberReports/CucumberReport.xml",
                "html:target/CucumberReport.html","pretty"
        })


@Test
public class Runner  extends AbstractTestNGCucumberTests {

        private static File jsonOutput;

        public static File getJsonOutput() {
                return jsonOutput;
        }
}
