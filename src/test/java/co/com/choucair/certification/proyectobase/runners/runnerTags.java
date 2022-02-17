package co.com.choucair.certification.proyectobase.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        tags = "@LoginSuccessful",
        glue = "stepDefinitions"
)
public class runnerTags {
}
