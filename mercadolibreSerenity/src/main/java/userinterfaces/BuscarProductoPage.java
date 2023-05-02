package userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.mercadolibre.com.co/")
public class BuscarProductoPage extends PageObject
{
    public static final Target btnCookie2 = Target.the("boton cookie").locatedBy("//div[@class='cookie-consent-banner-opt-out__actions']/button[text()='Entendido']");
    public static final Target txtBusqueda = Target.the("texto busqueda").located(By.id("cb1-edit"));
    public static final Target closeUbicacion = Target.the("cerrar ubicacion").locatedBy("//button[@class='andes-tooltip-button-close']");
    public static final Target linkProducto = Target.the("link Producto").locatedBy("//*[@class='ui-search-result-image__element shops__image-element'][1]");
    public static final Target btnAddCarrito = Target.the("boton add carrito").locatedBy("//button/span[text()='Agregar al carrito']");
    public static final Target btnCrearcuenta = Target.the("boton crear cuenta").locatedBy("//span[text()='Crear cuenta']");
    public static final Target btnLupa = Target.the("boton Lupa").locatedBy("//button[@type='submit']");


}
