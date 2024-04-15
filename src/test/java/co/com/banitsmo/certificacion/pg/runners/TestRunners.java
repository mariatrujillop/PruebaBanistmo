package co.com.banitsmo.certificacion.pg.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\ejercicio.feature",
        glue = "co.com.banitsmo.certificacion.pg.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class TestRunners {
}
