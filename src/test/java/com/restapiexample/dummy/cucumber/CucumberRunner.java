package com.restapiexample.dummy.cucumber;


import com.restapiexample.dummy.testbase.TestBase;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * created by krishna
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/resources/feature/",
tags = "@SMOKE")//feature contactpath
public class CucumberRunner extends TestBase {

}
