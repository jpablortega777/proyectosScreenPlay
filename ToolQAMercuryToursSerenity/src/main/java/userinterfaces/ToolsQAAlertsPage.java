package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ToolsQAAlertsPage extends PageObject
{
    public static final Target btnItemAlertas = Target.the("link Alertas en menu ToolsQA").locatedBy("//*[@id='item-1']/span[text()='Alerts']");
    public static final Target btnAlerta = Target.the("Boton 1 Alerta ToolsQA").located(By.id("alertButton"));
    public static final Target btnTimeAlerta = Target.the("Boton 2 Alerta ToolsQA").located(By.id("timerAlertButton"));
    public static final Target btnConfirmAlerta = Target.the("Boton 3 Alerta ToolsQA").located(By.id("confirmButton"));
    public static final Target btnpromtAlerta = Target.the("Boton 4 Alerta ToolsQA").located(By.id("promtButton"));

}
