package stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebDriver;
import task.BuscarProductoMercadoLibre;
import task.CrearCuentaMercadoLibre;
import userinterfaces.BuscarProductoPage;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class BusquedaProductoStep
{
    //CREAR VARIABLES DE NAVEGADOR Y ACTOR
    private WebDriver driver;
    private Actor actor = Actor.named("Usuario");
    //INSTANCIAR LA CLASE HOMEPAGE
    private BuscarProductoPage buscarProductoPage= new BuscarProductoPage();

    @Dado("que el cliente busca Producto y elige")
    public void que_el_cliente_busca_producto_y_elige() {
        //INDICANDO AL ACTOR QUE PUEDE ACCEDER A UN NAVEGADOR
        actor.can(BrowseTheWeb.with(driver));
        // EL ACTOR FUE CAPAZ DE ABRIR
        actor.wasAbleTo(Open.browserOn(buscarProductoPage));
        //MAXIMIZAR LA PAGINA
        getDriver().manage().window().maximize();
    }
    @Cuando("el cliente elija producto")
    public void el_cliente_elija_producto(io.cucumber.datatable.DataTable dataTable)
    {
        actor.wasAbleTo(BuscarProductoMercadoLibre.buscarProducto(dataTable.cell(0,0)));

    }
    @Entonces("^crea su cuenta (.*)")
    public void crea_su_cuenta(String email)
    {
        actor.wasAbleTo(CrearCuentaMercadoLibre.crearCuenta(email));
    }
}
