package userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.mercadolibre.com.co/")

public class HomePage extends PageObject
{
    public static final Target linkcuenta = Target.the("Link crear cuenta").locatedBy("//nav/a[text()='Crea tu cuenta']");
    public static final Target btnCookie = Target.the("cerrar cookies").locatedBy("//*[text()='Entendido']");
    public static final Target btnCheckBox = Target.the("seleccionar check").locatedBy("//input[@id='terms-and-conds']");
    public static final Target btnContinuar = Target.the("boton continuar").locatedBy("//span[@class='andes-button__content']");
    public static final Target btnValidarEmail = Target.the("validar email").locatedBy("//span[text()='Validar']");
    public static final Target txtEmail = Target.the("validar email").locatedBy("//input[@type='email']");

}
