package runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

//INICIAR QUE LA PRUEBA SE VA A EJECUTAR CON SERENITY
@RunWith(CucumberWithSerenity.class)

//RELACION DE DONDE ESTA UBICADO NUESTRA CONFIGURACION
@CucumberOptions(
        features = "src/test/resources/features/toolsQa.feature",//UBICACION DE DONDE SE ENCUENTRA NUESTROS FEACTURES
        glue = "stepDefinitions", //UBICACION DE DONDE SE ENCUENTRA NUESTROS STEPS
        tags = "",//UBICACION DE DONDE SE ENCUENTRA NUESTRAS TAREAS
        snippets = CucumberOptions.SnippetType.CAMELCASE //INTERPRETA LA LECTURA DE LOS PASOS EN JAVA
)


public class testRunner {
}
