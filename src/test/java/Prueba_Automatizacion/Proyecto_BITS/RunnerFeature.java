package Prueba_Automatizacion.Proyecto_BITS;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/feature/",
		glue = ("Proyecto_BITS.definitions")
)

public class RunnerFeature {

}
