package co.com.chourcair.utest.proyectobase.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/uTest.feature",
                tags = "@stories",
                glue = "co.com.choucair.utest.proyectobase.stepdefinitions",
                snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
