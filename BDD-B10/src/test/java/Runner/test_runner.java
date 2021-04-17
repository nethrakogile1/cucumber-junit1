package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Login/Login.feature"},
glue = {"stepdefinition"},
//tags="@invalidlogin","@Login",
//dryRun=false,//this is basically to check did i implement all the method//
//monochrome=true,//basically to get the right format is console
//strict =true
plugin = {"html:testoutput/kogile.html","junit:testoutput/kogile.xml","json:testoutput/kogile.json"}
)
public class test_runner {

	
	}

