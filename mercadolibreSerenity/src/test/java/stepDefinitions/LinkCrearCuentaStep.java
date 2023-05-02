package stepDefinitions;


import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.CrearCuentaMercadoLibre;
import task.LinkCuentaMercadoLibre;
import userinterfaces.HomePage;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class LinkCrearCuentaStep {
    @Managed(driver = "chrome")

    //CREAR VARIABLES DE NAVEGADOR Y ACTOR
    private WebDriver driver;
    private Actor actor = Actor.named("Usuario");
    //INSTANCIAR LA CLASE HOMEPAGE
    private HomePage homePage= new HomePage();
    @Dado("que el cliente debe ingresar al link de crear cuenta")
    public void queElClienteDebeIngresarAlLinkDeCrearCuenta() {

        //INDICANDO AL ACTOR QUE PUEDE ACCEDER A UN NAVEGADOR
        actor.can(BrowseTheWeb.with(driver));
        // EL ACTOR FUE CAPAZ DE ABRIR
        actor.wasAbleTo(Open.browserOn(homePage));
        //MAXIMIZAR LA PAGINA
        getDriver().manage().window().maximize();
    }
    @Cuando("^el cliente autorice el uso de los datos (.*)")
    public void elClienteAutoriceElUsoDeLosDatos(String correo)
    {

        actor.wasAbleTo(
                LinkCuentaMercadoLibre.linkCrearCuenta(),
                CrearCuentaMercadoLibre.crearCuenta(correo)
               );
    }
    @Entonces("ingresa la informacion para crear la cuenta")
    public void ingresaLaInformacionParaCrearLaCuenta(io.cucumber.datatable.DataTable dataTable)
    {
        System.out.println(dataTable);

    }
    @Entonces("aceptar terminos y condiciones")
    public void aceptarTerminosYCondiciones() {
    }

}